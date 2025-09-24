package com.zhuo.common.config;

import com.zhuo.common.enums.StorageType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "storage")
@Data
public class StorageProperties {
    // 类型
    private StorageType type;
    private AliyunOssProperties oss;
    private TencentCosProperties cos;
//    private MinIOProperties minIOProperties;

    @Data
    public static class AliyunOssProperties {
        private String endpoint;
        private String accessKey;
        private String secretKey;
        private String bucketName;
    }

    @Data
    public static class TencentCosProperties {
        private String secretId;
        private String secretKey;
        private String region;
        private String bucketName;
    }

//    @Data
//    public class MinIOProperties {
//        private String secretId;
//        private String secretKey;
//        private String region;
//        private String bucketName;
//    }


}
