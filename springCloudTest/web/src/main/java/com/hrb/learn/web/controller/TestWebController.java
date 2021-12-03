package com.hrb.learn.web.controller;

import com.hrb.learn.server.apis.TestServicesApis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghaoji
 * @date 2021/7/19
 */

@RestController
@RequestMapping("/test")
public class TestWebController {

    private final TestServicesApis testServicesApis;
    @Autowired
    TestWebController(TestServicesApis testServicesApis) {
        this.testServicesApis = testServicesApis;
    }

    @RequestMapping("/getTest")
    public String getTest() {
        return testServicesApis.get("通过web调用的");
    }

}
