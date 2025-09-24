package com.zhuo.common.service.tencent;

import com.zhuo.common.service.StorageService;

public class TencentCosService implements StorageService {

    private final TencentCosProperties properties;

    public TencentCosService(TencentCosProperties properties) {
        this.properties = properties;
    }

    @Override
    public String upload() {
        System.out.println("cos upload...");
        System.out.println(properties);
        return "cos";
    }
}
