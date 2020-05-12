package com.ss.api.data.center.service.api;

import com.ss.api.data.center.common.result.Result;
import com.ss.api.data.center.service.api.model.request.ModifyApiBaseInfoReqDTO;
import com.ss.api.data.center.service.api.model.request.QueryApiBaseInfoReqDTO;
import com.ss.api.data.center.service.api.model.response.QueryApiBaseInfoResDTO;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 4:32
 */
public interface ApiQueryService {

    /**
     * 接口详情查询
     * @param queryApiBaseInfoReqDTO
     * @return
     */
    Result<QueryApiBaseInfoResDTO> queryApiBaseInfo(QueryApiBaseInfoReqDTO queryApiBaseInfoReqDTO);

    /**
     * 接口修改
     * @param modifyApiBaseInfoReqDTO
     * @return
     */
    Result<Boolean> modifyApiBaseInfo(ModifyApiBaseInfoReqDTO modifyApiBaseInfoReqDTO);

}