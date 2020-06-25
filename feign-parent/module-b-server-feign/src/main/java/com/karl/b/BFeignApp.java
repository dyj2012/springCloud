package com.karl.b;

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
public class BFeignApp {

    public static void main(String[] args) {
        SpringApplication.run(BFeignApp.class, args);
    }

}

