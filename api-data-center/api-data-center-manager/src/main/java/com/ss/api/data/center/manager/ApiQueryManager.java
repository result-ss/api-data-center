package com.ss.api.data.center.manager;

import com.ss.api.data.center.manager.model.ApiBaseInfoBO;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 5:58
 */
public interface ApiQueryManager {

    /**
     * 接口详情查询
     * @param apiBaseInfoBO
     * @return
     */
    ApiBaseInfoBO queryApiDetail(ApiBaseInfoBO apiBaseInfoBO);

}
