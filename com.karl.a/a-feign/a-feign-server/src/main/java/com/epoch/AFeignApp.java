package com.epoch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/11/1
 */
@SpringBootApplication
@EnableFeignClients
public class AFeignApp {

    public static void main(String[] args) {
        SpringApplication.run(AFeignApp.class, args);
    }

}

