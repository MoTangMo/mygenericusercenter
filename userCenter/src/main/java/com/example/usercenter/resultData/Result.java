package com.example.usercenter.resultData;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private int statusCode;

    private String message;

    private Object data;

    Result() {

    }

    /**
     * 返回通用成功
     *
     * @return Result
     */
    public static Result ok() {
        Result result = new Result();
        result.setStatusCode(R.SUCCESS.getStatucCode());
        result.setMessage(R.SUCCESS.getMessage());
        result.setData(result.data);
        return result;
    }

    /**
     * 返回通用失败，未知错误
     *
     * @return Result
     */
    public static Result error(int statusCode,String message) {
        Result result = new Result();
        result.setStatusCode(statusCode);
        result.setMessage(message);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setStatusCode(R.ERROR_COMMOND.getStatucCode());
        result.setMessage(R.ERROR_COMMOND.getMessage());
        return result;
    }

    /**
     * 使用枚举类设置返回结果
     *
     * @param
     * @return
     */
    public static Result setResult(R r) {
        Result result = new Result();
        result.setStatusCode(r.getStatucCode());
        result.setMessage(r.getMessage());
        result.setData(result.data);
        return result;
    }


    /**
     * 返回结果类，使用链式编程
     * 自定义状态码
     *
     * @param
     * @return
     */
    public Result code(Integer code) {
        this.setStatusCode(code);
        return this;
    }

    /**
     * 返回结果类，使用链式编程
     * 自定义返回结果描述
     *
     * @param
     * @return
     */
    public Result desc(String desc) {
        this.setMessage(desc);
        return this;
    }

    /**
     * 返回结果类，使用链式编程
     * 自定义结果数据
     *
     * @param
     * @return
     */
    public Result data(Object data) {
        this.setData(data);
        return this;
    }

}
