package com.epoch.server.impl;

import com.epoch.server.api.IAServer;
import com.epoch.server.api.IBServer;
import com.epoch.server.api.RpcServer;
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
