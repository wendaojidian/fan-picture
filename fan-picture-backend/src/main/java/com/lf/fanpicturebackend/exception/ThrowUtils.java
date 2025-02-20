package com.lf.fanpicturebackend.exception;

/**
 * @author liufan
 * @description 抛出异常工具类
 * @since 2025/02/18
 */
public class ThrowUtils {
    public static void throwIf(boolean condition, RuntimeException exception) {
        if (condition) {
            throw exception;
        }
    }

    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }


}
