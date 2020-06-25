package com.karl.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/11/1
 */
@SpringBootApplication(scanBasePackages = "com.karl")
@EnableFeignClients("com.karl")
@EnableEurekaClient
public class AFeignApp {

    public static void main(String[] args) {
        SpringApplication.run(AFeignApp.class, args);
    }

}

