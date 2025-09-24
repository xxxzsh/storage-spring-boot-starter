package com.zhuo.common;

import com.zhuo.common.service.StorageService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author zhuosihua
 * @description: storageService测试类
 * @since 2025/9/25
 */
@SpringBootTest(classes = StarApplication.class)
class StorageAutoConfigurationTest {

    @Resource
    private StorageService storageService;

    @Test
    public void testStorageService() {
        storageService.upload();
    }
}
