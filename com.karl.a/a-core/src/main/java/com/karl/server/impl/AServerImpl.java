package com.karl.server.impl;

import com.karl.server.api.IAServer;
import com.karl.server.api.IBServer;
import com.karl.server.api.RpcServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@Service
public class AServerImpl implements IAServer {

    @Autowired
    private RpcServer rpcServer;

    @Override
    public void a() {
        System.out.println("a");
        IBServer bServer = rpcServer.getBServer();
        bServer.b();
    }
}
