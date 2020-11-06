package com.wei.shop.service;

import com.wei.shop.domain.Role;
import com.wei.shop.domain.User;

public interface LoginService {

   User  addUser(User user);

   Role addRole(Role role);

   User findByName(String name);

}
