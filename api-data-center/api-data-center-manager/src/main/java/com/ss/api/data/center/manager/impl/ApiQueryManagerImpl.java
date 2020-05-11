package com.ss.api.data.center.manager.impl;

import com.ss.api.data.center.dal.mapper.ApiBaseInfoMapper;
import com.ss.api.data.center.dal.model.ApiBaseInfoDO;
import com.ss.api.data.center.manager.ApiQueryManager;
import com.ss.api.data.center.manager.convert.ApiBaseConvert;
import com.ss.api.data.center.manager.model.ApiBaseInfoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 6:07
 */
@Component
public class ApiQueryManagerImpl implements ApiQueryManager {

    @Autowired
    private ApiBaseInfoMapper apiBaseInfoMapper;

    /**
     * 接口详情查询
     * @param apiBaseInfoBO
     * @return
     */
    @Override
    public ApiBaseInfoBO queryApiDetail(ApiBaseInfoBO apiBaseInfoBO) {
        ApiBaseInfoDO apiBaseInfoDO = apiBaseInfoMapper.queryApiBaseInfo(ApiBaseConvert.getQueryDOByBO(apiBaseInfoBO));
        return ApiBaseConvert.getQueryBOByDO(apiBaseInfoDO);
    }

}
