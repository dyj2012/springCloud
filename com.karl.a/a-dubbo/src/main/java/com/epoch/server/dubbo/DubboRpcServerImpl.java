package com.epoch.server.dubbo;

import com.epoch.server.api.IBServer;
import com.epoch.server.api.RpcServer;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@Service
public class DubboRpcServerImpl implements RpcServer {

    @Reference(version = "1.0.0")
    IBServer iBServer;

    @Override
    public IBServer getBServer() {
        return iBServer;
    }
}
