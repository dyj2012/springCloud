package com.karl.a.feign.server;

import com.karl.b.feign.client.BServerFeignClient;
import com.karl.server.api.IBServer;
import com.karl.server.api.RpcServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author 杜永军
 * @date 2019/10/31
 */
@Service
public class FeignRpcServerImpl implements RpcServer {

    @Autowired
    private BServerFeignClient bServerFeignClient;

    @Override
    public IBServer getBServer() {
        return bServerFeignClient;
    }
}
