package com.ss.api.data.center.dal.mapper;

import com.ss.api.data.center.dal.model.ApiBaseInfoDO;
import org.springframework.stereotype.Repository;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 6:11
 */
public interface ApiBaseInfoMapper {

    /**
     * 接口详情查询
     *
     * @param apiBaseInfoDO
     * @return
     */
    ApiBaseInfoDO queryApiBaseInfo(ApiBaseInfoDO apiBaseInfoDO);

    /**
     * 接口信息修改
     *
     * @param apiBaseInfoDO
     * @return
     */
    int updateApiBaseInfo(ApiBaseInfoDO apiBaseInfoDO);

}
