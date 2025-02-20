package com.lf.fanpicturebackend.common;

import com.lf.fanpicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liufan
 * @description 通用返回类
 * @since 2025/02/18
 */
@Data
public class BaseResponse<T> implements Serializable {
    private T data;
    private String msg;
    private int code;

    public BaseResponse(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
