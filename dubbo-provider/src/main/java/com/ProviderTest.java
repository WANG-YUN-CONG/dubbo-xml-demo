package com;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-parent
 * @description: 主方法
 * @author: 波波烤鸭
 * @create: 2019-05-13 20:39
 */
public class ProviderTest  {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");

        context.start();

        System.out.println("Dubbo provider start...");

        try {

            System.in.read(); // 按任意键退出

        } catch (IOException e) {

            e.printStackTrace();

        }

    }


}
