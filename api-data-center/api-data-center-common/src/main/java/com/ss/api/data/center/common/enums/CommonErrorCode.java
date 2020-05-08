package com.ss.api.data.center.common.enums;

import com.ss.api.data.center.common.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xueshansheng
 * @date 2019/11/26 上午 11:16
 */
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public enum CommonErrorCode implements ErrorCode {

    /**
     * 亲，系统内部异常，请稍后重试
     */
    SYSTEM_INNER_ERROR("SYSTEM_INNER_ERROR", "亲，系统内部异常，请稍后重试"),

    /**
     * 参数校验不通过
     */
    PARAMETER_VALID_NOT_PASS("PARAMETER_VALID_NOT_PASS", "参数校验不通过"),

    /**
     * 接口路径不可重复
     */
    API_URL_REPETITION("API_URL_REPETITION", "接口路径不可重复"),

    /**
     * 用户已存在
     */
    USER_EXISTENT("USER_EXISTENT", "用户已存在"),

    /**
     * 用户不存在
     */
    USER_NON_EXISTENT("USER_NON_EXISTENT", "用户不存在"),

    /**
     * 密码错误
     */
    PASSWORD_ERROR("PASSWORD_ERROR", "密码错误"),

    /**
     * 接口不存在
     */
    API_NON_EXISTENT("API_NON_EXISTENT", "接口不存在"),

    /**
     * 接口不存在
     */
    SORT_ERROR("SORT_ERROR", "排序出错");

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误描述
     */
    private String desc;
}
