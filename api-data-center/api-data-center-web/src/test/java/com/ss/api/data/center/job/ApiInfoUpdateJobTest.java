package com.ss.api.data.center.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.ss.api.data.center.BaseSpringTest;
import com.ss.api.data.center.task.ApiInfoUpdateJob;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xueshansheng
 * @date 2020/5/13 下午 2:24
 */
public class ApiInfoUpdateJobTest extends BaseSpringTest {

    @Autowired
    private ApiInfoUpdateJob apiInfoUpdateJob;

    @Test
    public void jobTest(){
        String jobName = "";
        int shardingCount = 10;
        String taskId = "";
        String jobParameter = "";
        Map<Integer, String> itemParameters = new HashMap<>();
        ShardingContexts contexts = new ShardingContexts(taskId, jobName, shardingCount, jobParameter, itemParameters);

        ShardingContext shardingContext = new ShardingContext(contexts, 0);
        apiInfoUpdateJob.execute(shardingContext);
    }
}
