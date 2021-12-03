package com.hrb.learn.server.services.impl;

import com.hrb.learn.server.services.TestServices;
import org.springframework.stereotype.Service;

/**
 * @author wanghaoji
 * @date 2021/7/19
 */

@Service
public class TestServicesImpl implements TestServices {

    @Override
    public String get(String name) {
        return "参数name：" + name;
    }

}
