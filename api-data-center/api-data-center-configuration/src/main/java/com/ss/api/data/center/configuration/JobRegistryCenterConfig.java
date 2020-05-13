package com.ss.api.data.center.configuration;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xueshansheng
 * @date 2020/5/13 下午 3:58
 */
@Configuration
@ConditionalOnExpression("'${regCenter.serverListt}'.length() > 0")
public class JobRegistryCenterConfig {

    @Value("${zookeeper.serverList}")
    private String serverList;

    @Value("${zookeeper.namespace.elasticJob}")
    private String namespace;

    @Bean
    public ZookeeperConfiguration zkConfig() {
        return new ZookeeperConfiguration(serverList, namespace);
    }

    @Bean(initMethod = "init", destroyMethod = "close")
    public ZookeeperRegistryCenter regCenter(ZookeeperConfiguration config) {
        return new ZookeeperRegistryCenter(config);
    }

}
