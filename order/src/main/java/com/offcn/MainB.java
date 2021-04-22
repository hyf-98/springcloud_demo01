package com.offcn;

import com.offcn.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainB {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("com.xml");
        OrderService order = ioc.getBean(OrderService.class);
        order.One(1);
        System.in.read();
    }
}
