package com.ss.api.data.center.configuration;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import com.ss.api.data.center.task.ApiInfoUpdateJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xueshansheng
 * @date 2020/5/13 下午 4:00
 */
@Configuration
public class JobConfig {

    @Autowired
    private ZookeeperRegistryCenter zookeeperRegistryCenter;

    @Autowired
    private  ApiInfoUpdateJob apiInfoUpdateJob;

    //定时任务的cron表达式
    @Value("${elasticJob.cron.myjob}")
    private String cron;

    //为任务的分片数量（即同时同时开几个定时任务）
    @Value("${elasticJob.shardingTotalCount.myjob}")
    private int shardingTotalCount;

    //为任务分片携带的参数
    @Value("${elasticJob.shardingItemParameters.myjob}")
    private String shardingItemParameters;

    public JobConfig() {
    }

    @Bean(initMethod = "init")
    public JobScheduler simpleJobScheduler() {
        LiteJobConfiguration liteJobConfiguration
                = getLiteJobConfiguration(apiInfoUpdateJob.getClass(), cron, shardingTotalCount, shardingItemParameters);
        JobScheduler jobScheduler
                = new SpringJobScheduler(apiInfoUpdateJob, zookeeperRegistryCenter, liteJobConfiguration);
        return jobScheduler;
    }

    /**
     *@Description  任务配置类
     */
    private LiteJobConfiguration getLiteJobConfiguration(final Class<? extends SimpleJob> jobClass,
                                                         final String cron,
                                                         final int shardingTotalCount,
                                                         final String shardingItemParameters){
        JobCoreConfiguration jobCoreConfiguration = JobCoreConfiguration.newBuilder(
                jobClass.getName(), cron, shardingTotalCount)
                .shardingItemParameters(shardingItemParameters)
                .build();
        SimpleJobConfiguration simpleJobConfiguration = new SimpleJobConfiguration(jobCoreConfiguration,jobClass.getCanonicalName());
        return LiteJobConfiguration.newBuilder(simpleJobConfiguration).overwrite(true).build();

    }

}
