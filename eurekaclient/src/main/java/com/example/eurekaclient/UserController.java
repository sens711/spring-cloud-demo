package com.example.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2 * @Author: wanghf-c
 * 3 * @Date: 2021/10/28 16:12
 * 4
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("who")
    public String who() {
        return "my name is liangwang";
    }
}