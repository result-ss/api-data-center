package com.ss.api.data.center.service.api.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;

/**
 * @author xueshansheng
 * @date 2020/5/12 下午 3:50
 */
@Setter
@Getter
@ToString
public class ModifyApiBaseInfoReqDTO implements Serializable {

    private static final long serialVersionUID = -3392662147271631197L;

    /**
     * 日志号
     */
    @NotNull(message = "日志号不能为空")
    @NotBlank(message = "日志号不能为空")
    private String traceLogId;

    /**
     * 接口路径
     */
    @NotNull(message = "接口路径不能为空")
    @NotBlank(message = "接口路径不能为空")
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
