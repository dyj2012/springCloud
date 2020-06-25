package com.epoch.server.local;

import com.epoch.server.api.IBServer;
import com.epoch.server.api.RpcServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 杜永军
 * @date 2019/10/31
 */
@Component
public class LocalRpcServerImpl implements RpcServer {

    @Autowired
    private IBServer iBServer;

    @Override
    public IBServer getBServer() {
        return iBServer;
    }
}
