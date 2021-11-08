package com.example.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 2 * @Author: wanghf-c
 * 3 * @Date: 2021/10/28 16:12
 * 4
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @RequestMapping("/info")
    public String orderInfo() {
        return "order info date : " + new Date().toString();
    }
}