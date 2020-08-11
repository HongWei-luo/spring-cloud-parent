package com.lhw.shop.feign.impl;

import com.lhw.shop.feign.FeignService;
import org.springframework.stereotype.Component;

/**
 * @author ：lhw
 * @date ：2020/8/10 15:37
 * @description：描述
 */
@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String feign() {
        return "亲，网络傻逼了，请检查你的网络";
    }
}
