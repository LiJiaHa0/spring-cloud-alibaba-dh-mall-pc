package com.dh.mall.userserviceprovider.service;

import com.dh.mall.user.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @description: 你好
 * @author: Jh Lee
 * @create: 2023-02-28 00:24
 **/
@DubboService(loadbalance = "random")
public class HelloService implements IHelloService {
    @Override
    public String say(String msg) {
        return "Hello" + msg + "I ' Dubbo Service";
    }
}
