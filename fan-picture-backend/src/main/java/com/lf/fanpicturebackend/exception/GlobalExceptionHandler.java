package com.lf.fanpicturebackend.exception;

import com.lf.fanpicturebackend.common.BaseResponse;
import com.lf.fanpicturebackend.common.ResultUtils;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author liufan
 * @description 全局异常处理器
 * @since 2025/02/18
 */
@Slf4j
@Hidden
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessException(BusinessException e) {
        log.error("BusinessException:", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeException(RuntimeException e) {
        log.error("RuntimeException:", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统异常");
    }
}
