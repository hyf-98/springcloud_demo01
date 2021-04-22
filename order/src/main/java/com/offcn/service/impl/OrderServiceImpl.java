package com.offcn.service.impl;

import com.offcn.service.OrderService;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    @Override
    public void One(int id) {
        String s= userService.getOne(id);
        System.out.println(s);
    }
}
