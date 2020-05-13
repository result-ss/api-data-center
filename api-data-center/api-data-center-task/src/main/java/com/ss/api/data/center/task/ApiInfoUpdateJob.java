package com.ss.api.data.center.task;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.ss.api.data.center.biz.job.ApiInfoUpdateJobBiz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xueshansheng
 * @date 2020/5/13 下午 1:56
 */
@Slf4j
@Component
public class ApiInfoUpdateJob implements SimpleJob {

    @Autowired
    private ApiInfoUpdateJobBiz apiInfoUpdateJobBiz;

    @Override
    public void execute(ShardingContext shardingContext) {
        long startTime = System.currentTimeMillis();
        log.info("接口信息修改定时任务开始执行,分片项:{}", shardingContext.getShardingItem());
        //业务实现
        apiInfoUpdateJobBiz.jobModifyApiInfo(shardingContext);
        log.info("接口信息修改定时任务执行完毕,分片项:{} 耗时：{}ms",
                shardingContext.getShardingItem(), System.currentTimeMillis() - startTime);
    }
}
