package cn.kr.service;

import cn.kr.interfaces.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello() {
        return "hello world";
    }
}
