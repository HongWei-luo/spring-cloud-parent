package com.wei.shop.shiro;

import com.wei.shop.dao.PermissionDao;
import com.wei.shop.dao.RoleDao;
import com.wei.shop.domain.Permission;
import com.wei.shop.domain.Role;
import com.wei.shop.domain.User;
import com.wei.shop.domain.UserRole;
import com.wei.shop.service.LoginService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import sun.rmi.runtime.NewThreadAction;

import javax.annotation.Resource;

/**
 * @author ：lhw
 * @date ：2020/11/5 17:14
 * @description：描述
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Resource
    private LoginService loginService;
    @Resource
    private RoleDao roleDao;
    @Resource
    private PermissionDao permissionDao;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Role role = new Role();
        // 获取登录用户名
        String name = (String) principalCollection.getPrimaryPrincipal();
        // 查询用户名称
        User user = loginService.findByName(name);
        // 添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        for (UserRole userRole :user.getUserRole()) {
            // 添加角色
            role = roleDao.selectByPrimaryKey(userRole.getRoleId());
            simpleAuthorizationInfo.addRole(role.getRoleName());
            Permission permission = permissionDao.selectByPrimaryKey(role.getPermissionId());
            // 添加权限
            simpleAuthorizationInfo.addStringPermission(permission.getPermission());
        }
        return simpleAuthorizationInfo;
    }

    /**
     * 用户认证
     *
     * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        if(authenticationToken.getPrincipal()==null){
            return  null;
        }
        //获取登录用户名
        String name = authenticationToken.getPrincipal().toString();
        //获取登录用户信息
        User user = loginService.findByName(name);
        //没用该用户
        if (user == null) {
            // 这里返回后会报出对应异常
            return null;
        } else {
            // 这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(name,
                    user.getPassword().toString(), getName());
            return simpleAuthenticationInfo;
        }
    }
}
