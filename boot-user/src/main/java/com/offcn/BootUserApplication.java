package com.offcn;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.curator.shaded.com.google.common.reflect.ClassPath;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@EnableDubbo //开启基于注解的dubbo功能
//@ImportResource(locations = "classpath:com.xml")  使用xml配置文件的开启注解
@SpringBootApplication
public class BootUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserApplication.class, args);


    }

}
