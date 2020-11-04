package com.wei.shop.api;

import com.wei.shop.domain.User;

public interface IDubboService {

    String helloDubbo(String s);

    User testMybatisPlus(String id);

    User testMybatisPlus2(String id);
}
