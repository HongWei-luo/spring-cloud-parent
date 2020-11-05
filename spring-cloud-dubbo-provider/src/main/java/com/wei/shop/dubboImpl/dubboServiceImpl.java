package com.wei.shop.dubboImpl;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wei.shop.api.IDubboService;
import com.wei.shop.dao.UserMapper;
import com.wei.shop.domain.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import javax.management.Query;

/**
 * @author ：lhw
 * @date ：2020/8/11 9:45
 * @description：通过 `org.apache.dubbo` 包下的 `@Service` 注解将服务暴露出去
 */

@Service(version = "1.0.0")
public class dubboServiceImpl implements IDubboService {
    @Value("${spring.application.name}")
    private String serverName;
    @Resource
    private UserMapper userMapper;

    @Override
    public String helloDubbo(String s) {
        return  "来自" + serverName+"的" + s ;
    }

    /**
     * 使用QueryWrapper对象
     * */
    @Override
    public User testMybatisPlus(String id) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("id",id);
        return userMapper.selectOne(userQueryWrapper);
    }

    /**
     * 直接调用自带方法
     * */
    @Override
    public User testMybatisPlus2(String id) {
        return userMapper.selectById(id);
    }
}
