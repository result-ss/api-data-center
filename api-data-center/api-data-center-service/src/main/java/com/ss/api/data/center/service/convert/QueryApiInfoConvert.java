package com.ss.api.data.center.service.convert;

import com.ss.api.data.center.manager.model.ApiBaseInfoBO;
import com.ss.api.data.center.service.api.model.request.QueryApiBaseInfoReqDTO;
import com.ss.api.data.center.service.api.model.response.QueryApiBaseInfoResDTO;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 5:03
 */
public class QueryApiInfoConvert {

    private QueryApiInfoConvert() {}

    public static ApiBaseInfoBO getQueryBOByDTO(QueryApiBaseInfoReqDTO queryApiBaseInfoReqDTO){
        if(queryApiBaseInfoReqDTO == null){
            return null;
        }
        ApiBaseInfoBO apiBaseInfoBO = new ApiBaseInfoBO();

        return apiBaseInfoBO;
    }

    public static QueryApiBaseInfoResDTO getQueryDTOByBO(ApiBaseInfoBO apiBaseInfoBO){
        if(apiBaseInfoBO == null){
            return null;
        }
        QueryApiBaseInfoResDTO queryApiBaseInfoResDTO = new QueryApiBaseInfoResDTO();

        return queryApiBaseInfoResDTO;
    }
}
