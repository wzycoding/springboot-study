package com.springboot.result;

import lombok.Data;

/**
 * 请求返回结果类
 */
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private int code;
    /**
     * 错误信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> Result success(T data) {
        Result<T> result = new Result<T>(0, "");
        result.setData(data);
        return result;
    }
    public static <T> Result success() {
        return new Result<T>(0, "");
    }

    public static <T> Result error(ErrorEnum errorEnum) {
        return new Result<T>(errorEnum.getCode(), errorEnum.getMsg());
    }
}
