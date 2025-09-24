package com.zhuo.common.service.aliyun;

import lombok.Data;

@Data
public class AliyunOssProperties {
    private String endpoint;
    private String accessKey;
    private String secretKey;
    private String bucketName;
}
