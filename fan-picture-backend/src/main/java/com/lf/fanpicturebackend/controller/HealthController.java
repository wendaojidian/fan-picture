package com.lf.fanpicturebackend.controller;

import com.lf.fanpicturebackend.common.BaseResponse;
import com.lf.fanpicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liufan
 * @description 健康检测接口
 * @since 2025/02/18
 */
@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
