package com.example.usercenter.exceptionHandler;

import com.example.usercenter.resultData.R;

/**
 * @description: 自定义异常类
 * @author: DT
 * @date: 2021/4/19 21:44
 * @version: v1.0
 */

public class myException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    protected int errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public myException() {
        super();
    }

    public myException(BaseErrorInfoInterface errorInfoInterface) {
        super(String.valueOf(errorInfoInterface.getResultCode()));
        this.errorCode = errorInfoInterface.getResultCode();
        this.errorMsg = errorInfoInterface.getResultMsg();
    }

    public myException(BaseErrorInfoInterface errorInfoInterface, Throwable cause) {
        super(String.valueOf(errorInfoInterface.getResultCode()), cause);
        this.errorCode = errorInfoInterface.getResultCode();
        this.errorMsg = errorInfoInterface.getResultMsg();
    }

    public myException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public myException(int errorCode, String errorMsg) {
        super(String.valueOf(errorCode));
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public myException(R r) {
        super(String.valueOf(r.getStatucCode()));
        this.errorCode = r.getStatucCode();
        this.errorMsg = r.getMessage();
    }

    public myException(int errorCode, String errorMsg, Throwable cause) {
        super(String.valueOf(errorCode), cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}



