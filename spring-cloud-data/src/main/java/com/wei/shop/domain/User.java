package com.wei.shop.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value="com.wei.shop.domain.User")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 8905103293894332090L;
    @ApiModelProperty(value="null")
    private Integer Id;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String username;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String password;

    @ApiModelProperty(value="null")
    private String sex;

    @ApiModelProperty(value="null")
    private String hobbys;

    /**
    * 登录使用的手机号
    */
    @ApiModelProperty(value="登录使用的手机号")
    private String phone;

    /**
    * 即时通讯
    */
    @ApiModelProperty(value="即时通讯")
    private String email;

    @ApiModelProperty(value="null")
    private String address;

    /**
    * 账号是否冻结，默认0未冻结
    */
    @ApiModelProperty(value="账号是否冻结，默认0未冻结")
    private Byte isDelete;
}