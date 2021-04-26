//package com.example.dubboprovider.config;
//
//import org.apache.dubbo.config.ApplicationConfig;
//import org.apache.dubbo.config.ProtocolConfig;
//import org.apache.dubbo.config.RegistryConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DubboConfig {
//    //教学视频：https://www.bilibili.com/video/BV13x41197pP?p=11
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig appConfig=new ApplicationConfig();
//        appConfig.setName("dubbo-consumer");
//        return appConfig;
//    }
//    @Bean
//    public RegistryConfig registryConfig(){
//        RegistryConfig registryConfig=new RegistryConfig();
//        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
//        return registryConfig;
//    }
//    @Bean
//    public ProtocolConfig protocolConfig(){
//        ProtocolConfig protocolConfig=new ProtocolConfig();
//        protocolConfig.setName("dubbo");
//        protocolConfig.setPort(20880);
//        return protocolConfig;
//    }
//
//}
