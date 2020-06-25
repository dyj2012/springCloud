package com.karl.a;

import com.karl.a.config.AConfig;
import com.karl.b.DemoBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2019/10/31
 */
@Service
public class DemoAServiceImpl implements DemoAService {

    @Autowired
    private AConfig aConfig;

    @Override
    public void hello() {
        System.out.println("this demo a service say hello");
        DemoBService bServer = aConfig.getDemoBService();
        System.out.println("a need call b service");
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        bServer.say(map);
    }
}
