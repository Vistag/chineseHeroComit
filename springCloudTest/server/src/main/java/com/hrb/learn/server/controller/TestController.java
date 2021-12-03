package com.hrb.learn.server.controller;

import com.hrb.learn.server.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghaoji
 * @date 2021/7/19
 */

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestServices testServices;
    @Autowired
    TestController(TestServices testServices) {
        this.testServices = testServices;
    }

    @RequestMapping("/get")
    public String get(String name) {
        System.err.println(name);
        return testServices.get(name);
    }

}
