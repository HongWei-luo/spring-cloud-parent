package com.wei.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wei.shop.dao.RoleDao;
import com.wei.shop.dao.UserDao;
import com.wei.shop.domain.Permission;
import com.wei.shop.domain.Role;
import com.wei.shop.domain.User;
import com.wei.shop.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author ：lhw
 * @date ：2020/11/5 15:58
 * @description：描述
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserDao userDao;
    @Resource
    private RoleDao roleDao;

    @Override
    public User addUser(User user) {
        userDao.insert(user);
        return null;
    }

    @Override
    public Role addRole(Role role) {
        //通过用户的名字获取该用户的所有信息
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("name",role.getUser().getUsername());
        //完整用户信息
        role.setUser(userDao.selectOne(userQueryWrapper));
        Permission permission1 = new Permission();
        //设置权限（模拟）
        permission1.setPermission("create");
        permission1.setRole(role);
        Permission permission2 = new Permission();
        permission2.setPermission("update");
        permission2.setRole(role);
        ArrayList<Permission> permissions = new ArrayList<>();
        permissions.add(permission1);
        permissions.add(permission2);
        role.setPermissions(permissions);
        roleDao.insert(role);
        return null;
    }

    @Override
    public User findByName(String name) {
        if ("".equals(name)){
            return null;
        }
        //通过用户的名字获取该用户的所有信息
      /*  QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username",name);
        return userDao.selectOne(userQueryWrapper);*/
        return userDao.findByName(name);
    }
}
