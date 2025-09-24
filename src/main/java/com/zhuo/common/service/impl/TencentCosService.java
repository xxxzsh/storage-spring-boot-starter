package com.zhuo.common.service.impl;

import com.zhuo.common.config.StorageProperties;
import com.zhuo.common.service.StorageService;

public class TencentCosService implements StorageService {

    private final StorageProperties.TencentCosProperties properties;

    public TencentCosService(StorageProperties.TencentCosProperties properties) {
        this.properties = properties;
    }

    @Override
    public String upload() {
        System.out.println("cos upload...");
        System.out.println(properties);
        return "cos";
    }
}
