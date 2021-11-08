package com.example.springcloudfeignconsumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 2 * @Author: wanghf-c
 * 3 * @Date: 2021/10/28 17:25
 * 4
 */
@FeignClient("SERVICE-PROVIDER")
public interface  HomeClient {
    @GetMapping("/order/info")
    String consumer();
}