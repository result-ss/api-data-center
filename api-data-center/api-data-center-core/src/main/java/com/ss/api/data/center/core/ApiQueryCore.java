package com.ss.api.data.center.core;

import com.ss.api.data.center.manager.ApiQueryManager;
import com.ss.api.data.center.manager.model.ApiBaseInfoBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 5:55
 */
@Slf4j
@Component
public class ApiQueryCore {

    @Autowired
    private ApiQueryManager apiQueryManager;

    /**
     * 接口详情查询
     * @param apiBaseInfoBO
     * @return
     */
    public ApiBaseInfoBO queryApiDetail(ApiBaseInfoBO apiBaseInfoBO) {
        ApiBaseInfoBO apiBaseInfo = apiQueryManager.queryApiDetail(apiBaseInfoBO);
        return apiBaseInfo;
    }
}
