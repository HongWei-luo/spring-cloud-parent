package com.lhw.shop.service.impl;

import com.lhw.shop.service.FeignService;
import org.springframework.stereotype.Service;

/**
 * @author ：lhw
 * @date ：2020/8/7 15:36
 * @description：feign的实现无需对provider模块做任何改动，正常
 */
@Service
public class FeignServiceImpl implements FeignService {

    @Override
    public String helloFeign(String s) {
        return "provider feign" + s;
    }
}
