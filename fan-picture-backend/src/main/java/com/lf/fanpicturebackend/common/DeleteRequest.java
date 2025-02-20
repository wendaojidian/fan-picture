package com.lf.fanpicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liufan
 * @description 删除请求
 * @since 2025/02/18
 */
@Data
public class DeleteRequest implements Serializable {
    private long id;
}
