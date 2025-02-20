package com.lf.fanpicturebackend.common;

import com.lf.fanpicturebackend.exception.ErrorCode;

/**
 * @author liufan
 * @description 返回工具类
 * @since 2025/02/18
 */
public class ResultUtils {

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    public static BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    public static BaseResponse<?> error(int code, String msg) {
        return new BaseResponse<>(code, null, msg);
    }

    public static BaseResponse<?> error(ErrorCode errorCode, String msg) {
        return new BaseResponse<>(errorCode.getCode(), null, msg);
    }
}
