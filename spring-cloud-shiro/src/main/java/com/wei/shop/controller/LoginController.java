package com.wei.shop.controller;

import com.wei.shop.domain.User;
import com.wei.shop.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ：lhw
 * @date ：2020/11/5 16:35
 * @description：描述
 */
@RestController
@RequestMapping(value = "/LoginController")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody User user){
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        SecurityUtils.getSubject().login(usernamePasswordToken);
        return "login ok";
    }

    @RequiresPermissions("create")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(@RequestBody  User user){
        loginService.addUser(user);
        return "add sucess";
    }

}

