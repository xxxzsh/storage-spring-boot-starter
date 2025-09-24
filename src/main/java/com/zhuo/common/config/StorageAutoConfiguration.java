package com.zhuo.common.config;

import com.zhuo.common.service.StorageService;
import com.zhuo.common.service.impl.AliyunOssStrategy;
import com.zhuo.common.service.impl.TencentCosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class StorageAutoConfiguration {

    private static final Logger log = LoggerFactory.getLogger(StorageAutoConfiguration.class);

    private final StorageProperties storageProperties;

    public StorageAutoConfiguration(StorageProperties storageProperties) {
        this.storageProperties = storageProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public StorageService storageService(StorageProperties properties) {
        switch (properties.getType()) {
            case TENCENT:
            case COS:
                return new TencentCosService(storageProperties.getCos());
            case ALIYUN:
            case OSS:
                return new AliyunOssStrategy(storageProperties.getOss());
//            case MINIO:
//                return new MinioStorageService(storageProperties.getMinio());
            default:
                log.warn("未知的 storage.type: {}", properties.getType());
                return null;
        }
    }

//    @Bean
//    @ConditionalOnMissingBean
//    @ConditionalOnProperty(prefix = "storage", name = "type", havingValue = "tencent")
//    public StorageService tencentCosService() {
//        System.out.println("loding tencent cos ...");
//        return new TencentCosService(storageProperties.getCos());
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    @ConditionalOnProperty(prefix = "storage", name = "type", havingValue = "aliyun")
//    public StorageService aliyunOssService() {
//        System.out.println("loding aliyun oss ...");
//        return new AliyunOssStrategy(storageProperties.getOss());
//    }
}
