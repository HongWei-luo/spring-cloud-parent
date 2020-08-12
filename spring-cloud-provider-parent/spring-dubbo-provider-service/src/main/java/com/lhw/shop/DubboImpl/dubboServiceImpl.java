package com.lhw.shop.DubboImpl;



import com.lhw.shop.api.dubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author ：lhw
 * @date ：2020/8/11 9:45
 * @description：通过 `org.apache.dubbo` 包下的 `@Service` 注解将服务暴露出去
 */
@Service(version = "1.0.0")
public class dubboServiceImpl implements dubboService {
    @Value("${spring.application.name}")
    private String serverName;

    @Override
    public String helloDubbo(String s) {
        return  "来自" + serverName+"的" + s ;
    }
}
