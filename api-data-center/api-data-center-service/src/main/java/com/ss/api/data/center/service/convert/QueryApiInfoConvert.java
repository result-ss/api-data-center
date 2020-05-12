package com.ss.api.data.center.service.convert;

import com.ss.api.data.center.manager.model.ApiBaseInfoBO;
import com.ss.api.data.center.service.api.model.request.ModifyApiBaseInfoReqDTO;
import com.ss.api.data.center.service.api.model.request.QueryApiBaseInfoReqDTO;
import com.ss.api.data.center.service.api.model.response.QueryApiBaseInfoResDTO;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 5:03
 */
public class QueryApiInfoConvert {

    private QueryApiInfoConvert() {
    }

    /**
     * QueryApiBaseInfoReqDTO --> ApiBaseInfoBO
     *
     * @param queryApiBaseInfoReqDTO
     * @return
     */
    public static ApiBaseInfoBO getQueryBOByDTO(QueryApiBaseInfoReqDTO queryApiBaseInfoReqDTO) {
        if (queryApiBaseInfoReqDTO == null) {
            return null;
        }
        ApiBaseInfoBO apiBaseInfoBO = new ApiBaseInfoBO();
        apiBaseInfoBO.setUrl(queryApiBaseInfoReqDTO.getUrl());
        apiBaseInfoBO.setApiName(queryApiBaseInfoReqDTO.getApiName());
        apiBaseInfoBO.setApiService(queryApiBaseInfoReqDTO.getApiService());
        apiBaseInfoBO.setRequestMethod(queryApiBaseInfoReqDTO.getRequestMethod());
        apiBaseInfoBO.setRequestDTO(queryApiBaseInfoReqDTO.getRequestDTO());
        apiBaseInfoBO.setCreateBy(queryApiBaseInfoReqDTO.getCreateBy());
        apiBaseInfoBO.setUpdateBy(queryApiBaseInfoReqDTO.getUpdateBy());
        return apiBaseInfoBO;
    }

    /**
     * ApiBaseInfoBO --> QueryApiBaseInfoResDTO
     *
     * @param apiBaseInfoBO
     * @return
     */
    public static QueryApiBaseInfoResDTO getQueryDTOByBO(ApiBaseInfoBO apiBaseInfoBO) {
        if (apiBaseInfoBO == null) {
            return null;
        }
        QueryApiBaseInfoResDTO queryApiBaseInfoResDTO = new QueryApiBaseInfoResDTO();
        queryApiBaseInfoResDTO.setUrl(apiBaseInfoBO.getUrl());
        queryApiBaseInfoResDTO.setApiName(apiBaseInfoBO.getApiName());
        queryApiBaseInfoResDTO.setApiService(apiBaseInfoBO.getApiService());
        queryApiBaseInfoResDTO.setRequestMethod(apiBaseInfoBO.getRequestMethod());
        queryApiBaseInfoResDTO.setStatus(apiBaseInfoBO.getStatus());
        queryApiBaseInfoResDTO.setRequestDTO(apiBaseInfoBO.getRequestDTO());
        queryApiBaseInfoResDTO.setCreateBy(apiBaseInfoBO.getCreateBy());
        queryApiBaseInfoResDTO.setUpdateBy(apiBaseInfoBO.getUpdateBy());
        return queryApiBaseInfoResDTO;
    }

    /**
     * ModifyApiBaseInfoReqDTO --> ApiBaseInfoBO
     *
     * @param modifyApiBaseInfoReqDTO
     * @return
     */
    public static ApiBaseInfoBO getModifyBOByDTO(ModifyApiBaseInfoReqDTO modifyApiBaseInfoReqDTO) {
        if (modifyApiBaseInfoReqDTO == null) {
            return null;
        }
        ApiBaseInfoBO apiBaseInfoBO = new ApiBaseInfoBO();
        apiBaseInfoBO.setUrl(modifyApiBaseInfoReqDTO.getUrl());
        apiBaseInfoBO.setApiName(modifyApiBaseInfoReqDTO.getApiName());
        apiBaseInfoBO.setApiService(modifyApiBaseInfoReqDTO.getApiService());
        apiBaseInfoBO.setRequestMethod(modifyApiBaseInfoReqDTO.getRequestMethod());
        apiBaseInfoBO.setRequestDTO(modifyApiBaseInfoReqDTO.getRequestDTO());
        apiBaseInfoBO.setUpdateBy(modifyApiBaseInfoReqDTO.getUpdateBy());
        apiBaseInfoBO.setCreateBy(modifyApiBaseInfoReqDTO.getCreateBy());
        apiBaseInfoBO.setStatus(modifyApiBaseInfoReqDTO.getStatus());
        return apiBaseInfoBO;
    }
}
