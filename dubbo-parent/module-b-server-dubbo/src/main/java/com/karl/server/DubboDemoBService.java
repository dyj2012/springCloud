package com.karl.server;

import com.karl.b.DemoBServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */

@Service(version = "1.0.0")
public class DubboDemoBService extends DemoBServiceImpl {

}
