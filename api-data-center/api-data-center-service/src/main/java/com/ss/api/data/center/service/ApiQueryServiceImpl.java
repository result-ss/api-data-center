package com.ss.api.data.center.service;

import com.ss.api.data.center.biz.ApiQueryBiz;
import com.ss.api.data.center.common.result.Result;
import com.ss.api.data.center.common.utils.VerifyUtil;
import com.ss.api.data.center.manager.model.ApiBaseInfoBO;
import com.ss.api.data.center.service.api.ApiQueryService;
import com.ss.api.data.center.service.api.model.request.QueryApiBaseInfoReqDTO;
import com.ss.api.data.center.service.api.model.response.QueryApiBaseInfoResDTO;
import com.ss.api.data.center.service.convert.QueryApiInfoConvert;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 5:01
 */
@Slf4j
@Service
public class ApiQueryServiceImpl implements ApiQueryService {

    @Autowired
    private ApiQueryBiz apiQueryBiz;

    /**
     * 接口详情查询
     * @param queryApiBaseInfoReqDTO
     * @return
     */
    @Override
    public Result<QueryApiBaseInfoResDTO> queryApiBaseInfo(QueryApiBaseInfoReqDTO queryApiBaseInfoReqDTO) {
//        MDC.put(LogMarker.TRACE_LOG_ID, queryApiBaseInfoReqDTO.getTraceLogId());
        log.info("接口详情查询，请求参数:{}", queryApiBaseInfoReqDTO);
        Result<QueryApiBaseInfoResDTO> result = new Result<QueryApiBaseInfoResDTO>();
        Long begin = System.currentTimeMillis();
        try {
            VerifyUtil.validateObject(queryApiBaseInfoReqDTO);
            ApiBaseInfoBO apiBaseInfoBO = QueryApiInfoConvert.getQueryBOByDTO(queryApiBaseInfoReqDTO);
            ApiBaseInfoBO apiBaseInfo = apiQueryBiz.queryApiDetail(apiBaseInfoBO);
            result.setResult(QueryApiInfoConvert.getQueryDTOByBO(apiBaseInfo));
            Long end = System.currentTimeMillis();
            log.info("接口详情查询成功，耗时{}ms，响应参数{}",(end-begin), result);
        } catch (Exception e) {
            Long end = System.currentTimeMillis();
            log.error(" 接口详情查询发生异常耗时{}ms，响应参数{},异常信息{}",(end-begin), result, e);
        } finally {
            MDC.clear();
        }
        return result;
    }
}
