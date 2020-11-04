package com.wei.shop.controller;


import com.wei.shop.api.IDubboService;
import com.wei.shop.conmom.Result;
import com.wei.shop.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lhw
 * @date ：2020/8/11 9:57
 * @description：通过 `org.apache.dubbo` 包下的 `@Reference` 注解像调用本地服务一样调用远程服务
 */
@SuppressWarnings("all")
@Api(tags = {"dubbo+swagger2+mybatisPlus测试"})
@RestController
public class DubboController {

    @Reference(version = "1.0.0")
    private IDubboService iDubboService;

    @ApiOperation(value = "测试dubbo")
    @RequestMapping(value = "/dubbo/{s}",method = RequestMethod.GET)
    @ApiImplicitParam(name = "s",value = "任意输入")
    public String dubbo(@PathVariable("s") String s){
        return iDubboService.helloDubbo(s);
    }

    /**
     * 统一返回格式 Result
     * */
    @ApiOperation(value = "测试mybatisPlus，通过用户id查用户信息")
    @ApiImplicitParam(required = true,name = "id",type = "String",value = "用户id")
    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    public Result getById(@PathVariable("id") String id){
        //直接调用baseMapper内部方法selectbyid（）
        return Result.ok(iDubboService.testMybatisPlus2(id));
        //使用QueryWrapper对象
        //return iDubboService.testMybatisPlus(id);
    }
}
