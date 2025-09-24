package com.zhuo.common.config;

import com.zhuo.common.service.StorageService;
import com.zhuo.common.service.impl.AliyunOssStrategy;
import com.zhuo.common.service.impl.TencentCosService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class StorageAutoConfiguration {

    private final StorageProperties storageProperties;

    public StorageAutoConfiguration(StorageProperties storageProperties) {
        this.storageProperties = storageProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    // todo zdd tencent or cos
    @ConditionalOnProperty(prefix = "storage", name = "type", havingValue = "tencent")
    public StorageService tencentCosService() {
        System.out.println("loding tencent cos ...");
        return new TencentCosService(storageProperties.getCos());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "storage", name = "type", havingValue = "aliyun")
    public StorageService aliyunOssService() {
        System.out.println("loding aliyun oss ...");
        return new AliyunOssStrategy(storageProperties.getOss());
    }
}
