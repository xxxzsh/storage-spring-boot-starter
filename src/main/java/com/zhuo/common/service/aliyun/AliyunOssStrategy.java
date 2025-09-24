//package com.zhuo.common.service.aliyun;
//
//import com.zhuo.common.config.StorageProperties;
//import com.zhuo.common.service.StorageService;
//
//public class AliyunOssStrategy implements StorageService {
//
//    private final StorageProperties.AliyunOssProperties properties;
//
//    public AliyunOssStrategy(StorageProperties.AliyunOssProperties properties) {
//        this.properties = properties;
//    }
//
//    @Override
//    public String upload() {
//        System.out.println("oss upload...");
//        System.out.println(properties);
//        return "oss";
//    }
//}
