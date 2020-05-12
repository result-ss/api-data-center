package com.ss.api.data.center.core;

import com.alibaba.fastjson.JSONObject;
import com.ss.api.data.center.manager.ApiQueryManager;
import com.ss.api.data.center.manager.model.ApiBaseInfoBO;
import com.ss.api.data.center.manager.utils.RedisManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 5:55
 */
@Slf4j
@Component
public class ApiQueryCore {

    @Autowired
    private ApiQueryManager apiQueryManager;

    @Autowired
    private RedisManager redisManager;

    /**
     * 接口详情查询
     *
     * @param apiBaseInfoBO
     * @return
     */
    public ApiBaseInfoBO queryApiDetail(ApiBaseInfoBO apiBaseInfoBO) {
        // 查redis
        if (redisManager.hasKey(apiBaseInfoBO.getUrl())) {
            return JSONObject.parseObject(redisManager.queryObjectByKey(apiBaseInfoBO.getUrl()), ApiBaseInfoBO.class);
        }
        ApiBaseInfoBO apiBaseInfo = apiQueryManager.queryApiDetail(apiBaseInfoBO);
        if (apiBaseInfo != null) {
            redisManager.insertObject(apiBaseInfoBO.getUrl(), apiBaseInfo, 24 * 20 * 60l);
        }
        return apiBaseInfo;
    }

    /**
     * 接口信息修改
     *
     * @param apiBaseInfoBO
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Boolean modifyApiInfo(ApiBaseInfoBO apiBaseInfoBO) {
        // 刷新redis
        ApiBaseInfoBO apiBaseInfo = JSONObject.parseObject(redisManager.queryObjectByKey(apiBaseInfoBO.getUrl()), ApiBaseInfoBO.class);
        if (apiBaseInfo != null) {
            redisManager.deleteObject(apiBaseInfoBO.getUrl());
            apiBaseInfo.setStatus(apiBaseInfoBO.getStatus());
        }
        redisManager.insertObject(apiBaseInfoBO.getUrl(), apiBaseInfo, 24 * 20 * 60l);
        return apiQueryManager.updateApiDetail(apiBaseInfoBO);
    }

}
