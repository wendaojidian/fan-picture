package com.lf.fanpicturebackend.exception;

import lombok.Getter;

/**
 * @author liufan
 * @description 业务异常
 * @since 2025/02/18
 */
@Getter
public class BusinessException extends RuntimeException {
    private final int code;

    public BusinessException(String message, int code) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }
}
