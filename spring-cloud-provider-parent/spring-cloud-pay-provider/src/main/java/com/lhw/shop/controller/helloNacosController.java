package com.lhw.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.CredentialNotFoundException;

/**
 * @author ：lhw
 * @date ：2020/8/6 10:22
 * @description： test for nacos
 */

@RestController
public class helloNacosController {

    @RequestMapping(value = "/helloNacos")
     public String helloNacos(){
         return "hello nacos";
     }
}
