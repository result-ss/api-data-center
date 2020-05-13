package com.ss.api.data.center.manager.impl;

import com.ss.api.data.center.dal.mapper.ApiBaseInfoMapper;
import com.ss.api.data.center.dal.model.ApiBaseInfoDO;
import com.ss.api.data.center.manager.ApiQueryManager;
import com.ss.api.data.center.manager.convert.ApiBaseConvert;
import com.ss.api.data.center.manager.model.ApiBaseInfoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
     *
     * @param apiBaseInfoBO
     * @return
     */
    @Override
    public ApiBaseInfoBO queryApiDetail(ApiBaseInfoBO apiBaseInfoBO) {
        ApiBaseInfoDO apiBaseInfoDO = apiBaseInfoMapper.queryApiBaseInfo(ApiBaseConvert.getQueryDOByBO(apiBaseInfoBO));
        return ApiBaseConvert.getQueryBOByDO(apiBaseInfoDO);
    }

    /**
     * 更新接口信息
     *
     * @param apiBaseInfoBO
     * @return
     */
    @Override
    public Boolean updateApiDetail(ApiBaseInfoBO apiBaseInfoBO) {
        int i = apiBaseInfoMapper.updateApiBaseInfo(ApiBaseConvert.getQueryDOByBO(apiBaseInfoBO));
        return i > 0;
    }

    /**
     * 查询最小id
     *
     * @return
     */
    @Override
    public Integer queryMinId() {
        return apiBaseInfoMapper.queryMinId();
    }

    /**
     * 查询最大id
     *
     * @return
     */
    @Override
    public Integer queryMaxId() {
        return apiBaseInfoMapper.queryMaxId();
    }

    /**
     * 接口信息列表查询
     * @param start
     * @param end
     * @return
     */
    @Override
    public List<ApiBaseInfoBO> queryApiInfoList(int start, int end) {
        List<ApiBaseInfoDO> apiBaseInfoDOS = apiBaseInfoMapper.queryApiBaseInfoList(start, end);
        List<ApiBaseInfoBO> apiBaseInfoBOs = ApiBaseConvert.getQueryBOsByDOs(apiBaseInfoDOS);
        return apiBaseInfoBOs;
    }

}
