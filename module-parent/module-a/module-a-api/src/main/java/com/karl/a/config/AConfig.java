package com.karl.a.config;

import com.karl.b.DemoBService;

/**
 * 模块配置
 *
 * @author 杜永军
 * @date 2019/10/31
 */
public interface AConfig {

    /**
     * 获取B服务
     *
     * @return
     */
    DemoBService getDemoBService();
}
