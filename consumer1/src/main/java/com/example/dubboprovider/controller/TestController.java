package com.example.dubboprovider.controller;

import com.example.dubboprovider.service.Provider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dubbo/test")
public class TestController {
    @Reference(version = "1.0.0", interfaceClass = Provider.class, check = false)
    Provider provider;

    @GetMapping("")
    public Map<String, Object> test() {
        String ins = provider.ins();
        Map<String, Object> map = new HashMap<>();
        System.out.println(ins);
        map.put("value", ins);
        return map;
    }

}
