package com.ss.api.data.center.service;

import com.ss.api.data.center.BaseSpringTest;
import com.ss.api.data.center.common.result.Result;
import com.ss.api.data.center.service.api.ApiQueryService;
import com.ss.api.data.center.service.api.model.request.QueryApiBaseInfoReqDTO;
import com.ss.api.data.center.service.api.model.response.QueryApiBaseInfoResDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 9:16
 */
public class QueryApiInfoTest extends BaseSpringTest {

    @Autowired
    private ApiQueryService apiQueryService;

    @Test
    public void queryiInfoTest(){
        QueryApiBaseInfoReqDTO queryApiBaseInfoReqDTO = new QueryApiBaseInfoReqDTO();
        Result<QueryApiBaseInfoResDTO> result = apiQueryService.queryApiBaseInfo(queryApiBaseInfoReqDTO);
    }
}
