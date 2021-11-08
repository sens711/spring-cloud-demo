package com.example.springcloudfeignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.example.springcloudfeignconsumer.*")
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
public class SpringCloudFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignConsumerApplication.class, args);
    }

}
