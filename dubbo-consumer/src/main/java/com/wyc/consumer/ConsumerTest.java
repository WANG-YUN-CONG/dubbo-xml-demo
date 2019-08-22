package com.wyc.consumer;

import com.wyc.bean.UserAddress;
import com.wyc.service.DemoService;
import com.wyc.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @program: dubbo-parent
 * @description: ConsumerTest
 * @author: wyc
 * @create: 2019-08-22 15:14
 */
public class ConsumerTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:springmvc.xml"});

        context.start();

//        DemoService demoService = (DemoService) context.getBean("demoService");
//        System.out.println(demoService.sayHello("获取到接口"));

        UserService userService = (UserService) context.getBean("userService");
        List<UserAddress> list = userService.getUserAddressList(String.valueOf(1));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        try {

            System.in.read();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}