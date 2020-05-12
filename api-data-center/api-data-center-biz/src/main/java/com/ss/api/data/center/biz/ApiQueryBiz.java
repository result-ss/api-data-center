package com.ss.api.data.center.biz;

import com.ss.api.data.center.core.ApiQueryCore;
import com.ss.api.data.center.manager.model.ApiBaseInfoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 5:48
 */
@Component
public class ApiQueryBiz {

    @Autowired
    private ApiQueryCore apiQueryCore;

    /**
     * 接口详情查询
     *
     * @param apiBaseInfoBO
     * @return
     */
    public ApiBaseInfoBO queryApiDetail(ApiBaseInfoBO apiBaseInfoBO) {
        ApiBaseInfoBO apiBaseInfo = apiQueryCore.queryApiDetail(apiBaseInfoBO);
        return apiBaseInfo;
    }

    /**
     * 接口信息修改
     *
     * @param apiBaseInfoBO
     * @return
     */
    public Boolean modifyApiInfo(ApiBaseInfoBO apiBaseInfoBO) {
        return apiQueryCore.modifyApiInfo(apiBaseInfoBO);
    }

}
