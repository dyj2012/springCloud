package com.karl.server;

import com.karl.b.server.DemoBService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@RestController
@RequestMapping("/inner/b")
public class DemoBServiceImpl implements DemoBService {

    @Override
    @PostMapping("/say")
    public void say(@RequestBody Map<String, String> map) {
        System.out.println(map);
        System.out.println("this demo b service say hello");
    }
}
