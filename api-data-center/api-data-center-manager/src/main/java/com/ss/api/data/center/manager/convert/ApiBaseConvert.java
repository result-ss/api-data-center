package com.ss.api.data.center.manager.convert;

import com.ss.api.data.center.dal.model.ApiBaseInfoDO;
import com.ss.api.data.center.manager.model.ApiBaseInfoBO;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 6:19
 */
public class ApiBaseConvert {

    /**
     * ApiBaseInfoBO --> ApiBaseInfoDO
     * @param apiBaseInfoBO
     * @return
     */
    public static ApiBaseInfoDO getQueryDOByBO(ApiBaseInfoBO apiBaseInfoBO){
        if(apiBaseInfoBO == null){
            return null;
        }
        ApiBaseInfoDO apiBaseInfoDO = new ApiBaseInfoDO();
        apiBaseInfoDO.setUrl(apiBaseInfoBO.getUrl());
        apiBaseInfoDO.setApiName(apiBaseInfoBO.getApiName());
        apiBaseInfoDO.setApiService(apiBaseInfoBO.getApiService());
        apiBaseInfoDO.setRequestMethod(apiBaseInfoBO.getRequestMethod());
        apiBaseInfoDO.setStatus(apiBaseInfoBO.getStatus());
        return apiBaseInfoDO;
    }

    /**
     * ApiBaseInfoDO --> ApiBaseInfoBO
     * @param apiBaseInfoDO
     * @return
     */
    public static ApiBaseInfoBO getQueryBOByDO(ApiBaseInfoDO apiBaseInfoDO){
        if(apiBaseInfoDO == null){
            return null;
        }
        ApiBaseInfoBO apiBaseInfoBO = new ApiBaseInfoBO();
        apiBaseInfoBO.setUrl(apiBaseInfoDO.getUrl());
        apiBaseInfoBO.setApiName(apiBaseInfoDO.getApiName());
        apiBaseInfoBO.setApiService(apiBaseInfoDO.getApiService());
        apiBaseInfoBO.setRequestDTO(apiBaseInfoDO.getRequestDTO());
        apiBaseInfoBO.setRequestMethod(apiBaseInfoDO.getRequestMethod());
        apiBaseInfoBO.setStatus(apiBaseInfoDO.getStatus());
        apiBaseInfoBO.setCreateBy(apiBaseInfoDO.getCreateBy());
        apiBaseInfoBO.setUpdateBy(apiBaseInfoDO.getUpdateBy());
        return apiBaseInfoBO;
    }

}
