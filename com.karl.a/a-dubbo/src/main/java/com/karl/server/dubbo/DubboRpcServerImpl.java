package com.karl.server.dubbo;

import com.karl.server.api.IBServer;
import com.karl.server.api.RpcServer;
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
