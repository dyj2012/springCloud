package com.karl.server;

import com.karl.a.config.AConfig;
import com.karl.b.DemoBService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@Service
public class AConfigDubboImpl implements AConfig {

    @Reference(version = "1.0.0")
    DemoBService demoBServer;

    @Override
    public DemoBService getDemoBService() {
        return demoBServer;
    }
}
