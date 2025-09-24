package com.zhuo.common.config;

import com.zhuo.common.enums.StorageType;
import com.zhuo.common.service.tencent.TencentCosProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "storage")
@Data
public class StorageProperties {
    // 类型
    private StorageType type;
    //    private AliyunOssProperties oss;
    private TencentCosProperties cos;
//    private MinIOProperties minIOProperties;

//    @Data
//    public class MinIOProperties {
//        private String secretId;
//        private String secretKey;
//        private String region;
//        private String bucketName;
//    }


}
