package com.dh.mall.dhmallportal;

import com.dh.mall.user.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: DubboContoller
 * @author: Jh Lee
 * @create: 2023-02-28 02:21
 **/
@RestController
public class DubboController {

    @DubboReference(cluster = "failfast")
    IHelloService helloService;

    @GetMapping("/say")
    public String say() {
        return helloService.say("Mic");
    }
}
