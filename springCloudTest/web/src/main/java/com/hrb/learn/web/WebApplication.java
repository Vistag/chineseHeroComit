package com.hrb.learn.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wanghaoji
 * @date 2021/7/19
 */

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.hrb.learn")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
