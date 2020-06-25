package com.epoch.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author 杜永军
 * @date 2018/06/04
 */
@SpringBootApplication(scanBasePackages = "com.epoch")
public class App extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


}