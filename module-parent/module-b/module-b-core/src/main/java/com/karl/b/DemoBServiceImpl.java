package com.karl.b;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */

@Service
public class DemoBServiceImpl implements DemoBService {

    @Override
    @PostMapping("/say")
    public void say(@RequestBody Map<String, String> map) {
        System.out.println(map);
        System.out.println("this demo b service say hello");
    }
}
