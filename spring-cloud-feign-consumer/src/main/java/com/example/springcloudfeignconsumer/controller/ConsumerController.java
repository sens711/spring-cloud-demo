package com.example.springcloudfeignconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
/**
 * 2 * @Author: wanghf-c
 * 3 * @Date: 2021/10/28 17:27
 * 4
 */
@RestController
public class ConsumerController {
    @Autowired
    private HomeClient homeClient;

    @HystrixCommand(fallbackMethod = "defaultStores")
    @GetMapping(value = "/hello")
    public String hello() {
        return  homeClient.consumer();
    }
    public String defaultStores() {
        return "Ribbon + hystrix ,提供者服务挂了";
    }
}