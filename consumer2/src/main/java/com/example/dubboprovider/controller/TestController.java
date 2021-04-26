package com.example.dubboprovider.controller;

import com.example.dubboprovider.service.Provider;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dubbo/test")
public class TestController {
//    @Reference(version = "1.0.0", interfaceClass = Provider.class, check = false)
//    Provider provider;
//    @Autowired
//    Provider demoService;

    @GetMapping("")
    public Map<String, Object> test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "dubbo.xml" });
        context.start();

        Provider provider = (Provider) context.getBean("provider");

        String ins = provider.ins();
        Map<String, Object> map = new HashMap<>();
        System.out.println(ins);
        map.put("value", "consumer2 "+ins);
        return map;
    }

}
