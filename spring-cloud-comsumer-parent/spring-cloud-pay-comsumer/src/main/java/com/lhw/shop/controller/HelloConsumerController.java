package com.lhw.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lhw
 * @date ：2020/8/6 16:45
 *
 */
@RestController
public class HelloConsumerController {

    @RequestMapping(value = "/helloConsumer")
    public String helloConsumer(){
       return "helloConsumer" ;
    }
}
