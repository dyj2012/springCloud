package com.karl.server.local;

import com.karl.server.api.IBServer;
import com.karl.server.api.RpcServer;
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
