package com.ss.api.data.center.common.result;


import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * @author xueshansheng
 * @date 2019/11/26 下午 3:30
 */
public class Result<T> implements Serializable {

    /**
     * 调用是否成功
     */
    private boolean success;

    /**
     * 调用结果集
     */
    private T result;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorMsg;

    /**
     * 原始错误码
     */
    private String primaryErrorCode;

    /**
     * 原始错误描述
     */
    private String primaryErrorMsg;

    /**
     * 原始错误IP
     */
    private String primaryErrorIP;

    /**
     * 默认构造方法
     */
    public Result() {
    }

    /**
     * 直接构造成功的返回
     *
     * @param result
     */
    public Result(T result) {

        this.success = true;
        this.result = result;
    }

    /**
     * 直接构造失败的返回
     *
     * @param errorCode 错误码
     * @param errorMsg  错误描述
     */
    public Result(String errorCode, String errorMsg) {

        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    /**
     * 直接构造失败的返回
     *
     * @param errorCode        错误码
     * @param errorMsg         错误描述
     * @param primaryErrorCode 原始错误码
     * @param primaryErrorMsg  原始错误描述
     * @param primaryErrorIP   原始错误IP
     */
    public Result(String errorCode, String errorMsg,
                  String primaryErrorCode, String primaryErrorMsg, String primaryErrorIP) {

        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.primaryErrorCode = primaryErrorCode;
        this.primaryErrorMsg = primaryErrorMsg;
        this.primaryErrorIP = primaryErrorIP;
    }

    /**
     * 判断调用是否成功
     *
     * @return
     */
    public boolean isSuccess() {

        return success;
    }

    /**
     * 获取调用结果集
     *
     * @return
     */
    public T getResult() {

        return result;
    }

    /**
     * 设置调用结果集
     *
     * @param result 结果集
     */
    public void setResult(T result) {

        success = true;
        this.result = result;
    }

    /**
     * 获取错误码
     *
     * @return
     */
    public String getErrorCode() {

        return errorCode;
    }


    /**
     * 设置错误码
     *
     * @param errorCode 错误码
     */
    public void setErrorCode(String errorCode) {

        this.success = false;
        this.errorCode = errorCode;
    }

    /**
     * 获取错误描述
     *
     * @return
     */
    public String getErrorMsg() {

        return errorMsg;
    }

    /**
     * 设置错误描述
     *
     * @param errorMsg 错误描述
     */
    public void setErrorMsg(String errorMsg) {

        this.errorMsg = errorMsg;
    }

    /**
     * 获取原始错误码
     *
     * @return
     */
    public String getPrimaryErrorCode() {

        return primaryErrorCode;
    }

    /**
     * 设置原始错误码
     *
     * @param primaryErrorCode 原始错误码
     */
    public void setPrimaryErrorCode(String primaryErrorCode) {

        this.primaryErrorCode = primaryErrorCode;
    }

    /**
     * 获取原始错误码
     *
     * @return
     */
    public String getPrimaryErrorMsg() {

        return primaryErrorMsg;
    }

    /**
     * 设置原始错误码
     *
     * @param primaryErrorMsg 原始错误码
     */
    public void setPrimaryErrorMsg(String primaryErrorMsg) {

        this.primaryErrorMsg = primaryErrorMsg;
    }

    /**
     * 获取原错误码IP
     *
     * @return
     */
    public String getPrimaryErrorIP() {

        return primaryErrorIP;
    }

    /**
     * 设置原错误码IP
     *
     * @param primaryErrorIP 原始错误描述
     */
    public void setPrimaryErrorIP(String primaryErrorIP) {

        this.primaryErrorIP = primaryErrorIP;
    }

    /**
     * 重写toString方法
     *
     * @return
     */
    @Override
    public String toString() {

        return Objects.toStringHelper(this)
                .add("success", success)
                .add("result", result)
                .add("errorCode", errorCode)
                .add("errorMsg", errorMsg)
                .add("primaryErrorCode", primaryErrorCode)
                .add("primaryErrorMsg", primaryErrorMsg)
                .add("primaryErrorIP", primaryErrorIP)
                .omitNullValues()
                .toString();
    }
}
