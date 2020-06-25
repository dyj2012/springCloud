package com.karl.server.impl;

import com.karl.server.api.IAServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/11/1
 */
@RestController
public class AController {

    @Autowired
    IAServer iAServer;

    @GetMapping("/a/test")
    public void test(){
        iAServer.a();
    }
}
