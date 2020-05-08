package com.ss.api.data.center.manager.convert;

import com.ss.api.data.center.dal.model.ApiBaseInfoDO;
import com.ss.api.data.center.manager.model.ApiBaseInfoBO;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 6:19
 */
public class ApiBaseConvert {

    public static ApiBaseInfoDO getQueryDOByBO(ApiBaseInfoBO apiBaseInfoBO){
        if(apiBaseInfoBO == null){
            return null;
        }
        ApiBaseInfoDO apiBaseInfoDO = new ApiBaseInfoDO();

        return apiBaseInfoDO;
    }

}
