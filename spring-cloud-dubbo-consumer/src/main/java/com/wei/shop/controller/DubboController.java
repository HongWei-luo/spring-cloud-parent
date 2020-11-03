package com.wei.shop.controller;


import com.wei.shop.api.IDubboService;
import com.wei.shop.domain.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lhw
 * @date ：2020/8/11 9:57
 * @description：通过 `org.apache.dubbo` 包下的 `@Reference` 注解像调用本地服务一样调用远程服务
 */
@RestController
public class DubboController {

    @Reference(version = "1.0.0")
    private IDubboService iDubboService;

    @RequestMapping(value = "/dubbo/{s}",method = RequestMethod.GET)
    public String dubbo(@PathVariable("s") String s){
        return iDubboService.helloDubbo(s);
    }

    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    public User getById(@PathVariable("id") String id){
        return iDubboService.testMybatisPlus(id);
    }
}