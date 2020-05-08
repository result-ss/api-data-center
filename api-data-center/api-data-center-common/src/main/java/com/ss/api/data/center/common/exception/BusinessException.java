package com.ss.api.data.center.common.exception;

import com.ss.api.data.center.common.enums.CommonErrorCode;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author xueshansheng
 * @date 2019/11/26 上午 11:14
 */
public class BusinessException extends RuntimeException implements Serializable {

    @Getter
    private String errorCode;

    public BusinessException(String errorCode) {
        this.errorCode = errorCode;
    }

    public BusinessException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(CommonErrorCode commonErrorCode) {
        super(commonErrorCode.getDesc());
        this.errorCode = commonErrorCode.getCode();
    }
}
