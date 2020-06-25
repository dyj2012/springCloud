package com.epoch.server.impl;

import com.epoch.server.api.IBServer;
import org.springframework.stereotype.Service;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@Service("bServer")
public class BServerImpl implements IBServer {

    @Override
    public void b() {
        System.out.println("b");
    }
}
