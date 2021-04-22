package com.offcn.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.service.UserService;
import org.springframework.stereotype.Component;

@Service //dubbo包下的service，用于暴露服务
@Component//代替原spring包中的service注解
public class UserServiceImpl implements UserService {
    @Override
    public String getOne(int id) {
        System.out.println("1");
        return "我是你爸爸";
    }
}
