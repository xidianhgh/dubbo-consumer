package com.example.dubboprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
//@DubboComponentScan
public class DubboConsumerApplication {

    public static void main(String[] args) {
//        new ClassPathXmlApplicationContext(
//                new String[] { "dubbo.xml" }).start();
        SpringApplication.run(DubboConsumerApplication.class, args);
        System.out.println("dubbo消费者2启动....");
//        System.out.println(NetUtils.getLocalAddress().getHostAddress());
    }

}
