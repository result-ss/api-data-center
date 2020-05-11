package com.ss.api.data.center.manager.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 5:41
 */
@Setter
@Getter
@ToString
public class ApiBaseInfoBO {

    /**
     * 接口路径
     */
    private String url;

    /**
     * 接口名称
     */
    private String apiName;

    /**
     * 接口服务
     */
    private String apiService;

    /**
     * 请求参数
     */
    private String requestDTO;

    /**
     * 请求方法
     */
    private String requestMethod;

    /**
     * 接口状态
     */
    private String status;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新人
     */
    private String updateBy;

}
