package com.karl.b.feign.client;

import com.karl.server.api.IBServer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jimin.jm@alibaba-inc.com
 * @date 2019/06/14
 */
@FeignClient(name = "b-service")
public interface BServerFeignClient extends IBServer {

    @Override
    @GetMapping("/b")
    void b();
}
