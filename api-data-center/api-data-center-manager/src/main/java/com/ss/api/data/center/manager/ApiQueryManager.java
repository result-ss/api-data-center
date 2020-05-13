package com.ss.api.data.center.manager;

import com.ss.api.data.center.manager.model.ApiBaseInfoBO;

import java.util.List;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 5:58
 */
public interface ApiQueryManager {

    /**
     * 接口详情查询
     *
     * @param apiBaseInfoBO
     * @return
     */
    ApiBaseInfoBO queryApiDetail(ApiBaseInfoBO apiBaseInfoBO);

    /**
     * 接口信息修改
     *
     * @param apiBaseInfoBO
     * @return
     */
    Boolean updateApiDetail(ApiBaseInfoBO apiBaseInfoBO);

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
    List<ApiBaseInfoBO> queryApiInfoList(int start, int end);

}
