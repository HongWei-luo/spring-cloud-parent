package com.lhw.shop.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.CredentialNotFoundException;

/**
 * @author ：lhw
 * @date ：2020/8/6 10:22
 * @description： test for nacos
 */

@RestController
public class HelloProviderController {

     @RequestMapping(value = "/helloNacos")
      public String helloNacos(){
         return "hello nacos";
     }
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/feign")
     public String feign(){
        return "provider controller feign " + serverPort;
     }
}
