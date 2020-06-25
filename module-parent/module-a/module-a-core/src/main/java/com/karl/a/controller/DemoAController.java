package com.karl.a.controller;

import com.karl.a.DemoAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/11/1
 */
@RestController
@RequestMapping("/a")
public class DemoAController {

    @Autowired
    DemoAService demoAService;

    @GetMapping("/test")
    public void test() {
        demoAService.hello();
    }
}
