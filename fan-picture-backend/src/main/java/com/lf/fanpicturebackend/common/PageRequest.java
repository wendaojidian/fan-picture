package com.lf.fanpicturebackend.common;

import lombok.Data;

/**
 * @author liufan
 * @description 分页请求
 * @since 2025/02/18
 */
@Data
public class PageRequest {
    private int page;
    private int pageNum;
    private String sortField;
    private String sortOrder;
}
