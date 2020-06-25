package com.karl.b.feign.server;

import com.karl.server.api.IBServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@RestController
public class FeignBServer implements IBServer {

    @Autowired
    IBServer iBServer;

    @Override
    @RequestMapping("b")
    public void b() {
        iBServer.b();
    }
}
