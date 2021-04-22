package com.offcn.controller;

import com.offcn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;


    @ResponseBody
    @RequestMapping("/init")
    public String initOrder(@RequestParam("uid") int id){
        return orderService.One(id);
    }
}
