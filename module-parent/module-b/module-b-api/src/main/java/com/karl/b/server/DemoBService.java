package com.karl.b.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@FeignClient(name = "b-service")
public interface DemoBService {

    @PostMapping("/inner/b/say")
    void say(@RequestBody Map<String, String> map);
}
