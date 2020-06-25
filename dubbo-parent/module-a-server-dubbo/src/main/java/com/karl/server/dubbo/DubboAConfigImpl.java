package com.karl.server.dubbo;

import com.karl.a.config.AConfig;
import com.karl.b.server.DemoBService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@Service
public class DubboAConfigImpl implements AConfig {

    @Reference(version = "1.0.0")
    DemoBService demoBServer;

    @Override
    public DemoBService getDemoBService() {
        return demoBServer;
    }
}
