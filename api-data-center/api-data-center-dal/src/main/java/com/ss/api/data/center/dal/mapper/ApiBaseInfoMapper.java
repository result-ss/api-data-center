package com.ss.api.data.center.dal.mapper;

import com.ss.api.data.center.dal.model.ApiBaseInfoDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /**
     * 查询最小id
     *
     * @return
     */
    Integer queryMinId();

    /**
     * 查询最大id
     *
     * @return
     */
    Integer queryMaxId();

    /**
     * 接口信息列表查询
     * @param start
     * @param end
     * @return
     */
    List<ApiBaseInfoDO> queryApiBaseInfoList(@Param("startId") int start, @Param("endId") int end);

}
