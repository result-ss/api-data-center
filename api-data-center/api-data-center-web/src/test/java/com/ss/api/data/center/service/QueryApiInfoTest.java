package com.ss.api.data.center.service;

import com.ss.api.data.center.BaseSpringTest;
import com.ss.api.data.center.common.result.Result;
import com.ss.api.data.center.service.api.ApiQueryService;
import com.ss.api.data.center.service.api.model.request.ModifyApiBaseInfoReqDTO;
import com.ss.api.data.center.service.api.model.request.QueryApiBaseInfoReqDTO;
import com.ss.api.data.center.service.api.model.response.QueryApiBaseInfoResDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 9:16
 */
@Slf4j
public class QueryApiInfoTest extends BaseSpringTest {

    @Autowired
    private ApiQueryService apiQueryService;

    @Test
    public void queryInfoTest(){
        QueryApiBaseInfoReqDTO queryApiBaseInfoReqDTO = new QueryApiBaseInfoReqDTO();
        queryApiBaseInfoReqDTO.setTraceLogId("ss");
        queryApiBaseInfoReqDTO.setUrl("/gateway/loge");
        Result<QueryApiBaseInfoResDTO> result = apiQueryService.queryApiBaseInfo(queryApiBaseInfoReqDTO);
        log.info("接口详情查询响应结果，{}",result);
    }

    @Test
    public void updateTest(){
        ModifyApiBaseInfoReqDTO modifyApiBaseInfoReqDTO = new ModifyApiBaseInfoReqDTO();
        modifyApiBaseInfoReqDTO.setTraceLogId("ss");
        modifyApiBaseInfoReqDTO.setUrl("/gateway/loge");
        modifyApiBaseInfoReqDTO.setStatus("ENABLE");
        Result<Boolean> result = apiQueryService.modifyApiBaseInfo(modifyApiBaseInfoReqDTO);
        log.info("接口信息修改响应结果，{}",result);
    }

}
