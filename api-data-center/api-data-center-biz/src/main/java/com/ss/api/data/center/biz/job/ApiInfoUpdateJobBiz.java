package com.ss.api.data.center.biz.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.ss.api.data.center.core.ApiQueryCore;
import com.ss.api.data.center.manager.model.ApiBaseInfoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xueshansheng
 * @date 2020/5/13 下午 2:01
 */
@Component
public class ApiInfoUpdateJobBiz {

    @Autowired
    private ApiQueryCore apiQueryCore;

    /**
     * 接口信息修改
     *
     * @param shardingContext
     * @return
     */
    public void jobModifyApiInfo(ShardingContext shardingContext) {
        int minId = apiQueryCore.queryMinId();
        if (minId == 0) {
            return;
        }
        int maxId = apiQueryCore.queryMaxId();
        if (maxId == 0) {
            return;
        }
        List<ApiBaseInfoBO> apiBaseInfoBOS = apiQueryCore.queryApiInfoList(minId, maxId);
        if(apiBaseInfoBOS.size() == 0){
            return;
        }
        for(ApiBaseInfoBO apiBaseInfoBO : apiBaseInfoBOS){
            apiBaseInfoBO.setStatus("ENABLE");
            apiQueryCore.modifyApiInfo(apiBaseInfoBO);
        }
    }
}
