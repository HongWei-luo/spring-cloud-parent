package com.lhw.shop.controller;

import com.lhw.shop.feign.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：lhw
 * @date ：2020/8/6 16:45
 *
 */
@RestController
public class HelloConsumerController {

    @Resource
    private FeignService feignService;

    @RequestMapping(value = "/helloConsumer")
    public String helloConsumer(){
       return "helloConsumer" ;
    }

    @GetMapping(value = "/feign")
    public String feign(){
        return feignService.feign();
    }
}
