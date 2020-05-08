package com.ss.api.data.center.service.api.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 4:36
 */
@Setter
@Getter
@ToString
public class QueryApiBaseInfoResDTO implements Serializable {

    /**
     * 序列ID
     */
    private static final long serialVersionUID = -4603451616324983199L;

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
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateAt;

}
