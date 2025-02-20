package com.lf.fanpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author liufan
 */
@SpringBootApplication
@MapperScan("com.lf.fanpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class FanPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanPictureBackendApplication.class, args);
    }

}
