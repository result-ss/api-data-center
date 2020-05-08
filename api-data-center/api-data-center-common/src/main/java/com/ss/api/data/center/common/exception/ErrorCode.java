package com.ss.api.data.center.common.exception;


import java.io.Serializable;

/**
 * @author xueshansheng
 * @date 2019/11/26 上午 11:17
 */
public interface ErrorCode extends Serializable {

    /**
     * 错误码
     *
     * @return
     */
    String getCode();

    /**
     * 错误描述
     *
     * @return
     */
    String getDesc();
}
