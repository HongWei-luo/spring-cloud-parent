package com.wei.shop.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(value="com.wei.shop.domain.UserRole")
@Data
public class UserRole {
    @ApiModelProperty(value="null")
    private String id;

    @ApiModelProperty(value="null")
    private String userId;

    @ApiModelProperty(value="null")
    private String roleId;


    private Role role;
}