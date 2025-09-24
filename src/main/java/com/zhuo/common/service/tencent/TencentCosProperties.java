package com.zhuo.common.service.tencent;

import lombok.Data;

@Data
public class TencentCosProperties {
    /**
     * 腾讯云 SecretId
     */
    private String secretId;

    /**
     * 腾讯云 SecretKey
     */
    private String secretKey;

    /**
     * 区域，例如 ap-hongkong
     */
    private String region;

    /**
     * STS 临时密钥过期时间，单位秒
     */
    private Integer expireSeconds;

    /**
     * 存储桶名称
     */
    private String bucketName;

    /**
     * APPID
     */
    private String appid;
}
