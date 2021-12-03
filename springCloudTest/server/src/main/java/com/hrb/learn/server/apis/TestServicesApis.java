package com.hrb.learn.server.apis;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanghaoji
 * @date 2021/7/19
 */

@FeignClient(name = "server-service", contextId = "TestServicesApis")
public interface TestServicesApis {

    /**
     * 取得名称
     * @param name 名称
     * @return 名称
     */
    @RequestMapping(value = "/test/get")
    String get(String name);

}
