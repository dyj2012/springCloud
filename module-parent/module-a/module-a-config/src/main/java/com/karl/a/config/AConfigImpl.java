package com.karl.a.config;

import com.karl.b.server.DemoBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 杜永军
 * @date 2019/10/31
 */
@Service
public class AConfigImpl implements AConfig {

    @Autowired
    private DemoBService demoBService;

    @Override
    public DemoBService getDemoBService() {
        return demoBService;
    }
}
