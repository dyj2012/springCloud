package com.karl;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/11/1
 */
@SpringBootApplication(scanBasePackages = "com.karl")
@EnableDiscoveryClient
@EnableDubbo(scanBasePackages = "com.karl")
public class ADubboApp {

    public static void main(String[] args) {
        SpringApplication.run(ADubboApp.class,args);
    }
}


