package com.offcn.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.service.OrderService;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Reference //远程从注册中心引用服务
    UserService userService;
    @Override
    public String One(int id) {
        String s= userService.getOne(id);
        System.out.println(s);
        return s;
    }
}
