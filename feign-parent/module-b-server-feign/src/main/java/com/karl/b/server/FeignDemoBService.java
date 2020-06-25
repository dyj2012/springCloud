package com.karl.b.server;

import com.karl.b.DemoBServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@RestController
@RequestMapping("/inner/b")
public class FeignDemoBService extends DemoBServiceImpl {

}
