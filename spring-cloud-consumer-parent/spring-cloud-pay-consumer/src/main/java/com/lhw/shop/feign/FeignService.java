package com.lhw.shop.feign;

import com.lhw.shop.feign.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：lhw
 * @date ：2020/8/7 10:08
 */
@FeignClient(name = "spring-cloud-pay-provider",fallback = FeignServiceImpl.class)
public interface FeignService {


    /**
     * fetch data by rule id
     *
     * @return Result<XxxxDO>
     */
    @GetMapping(value = "/feign")
    String feign();
}
