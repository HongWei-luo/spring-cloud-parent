package com.lhw.shop.controller;

import com.lhw.shop.api.dubboService;
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

    @Reference(version = "0.0.1")
    private dubboService dubboService;
    @RequestMapping(value = "/dubbo/{s}",method = RequestMethod.GET)
    public String helloDubbo(@PathVariable("s") String s){
        return dubboService.helloDubbo(s);
    }
}
