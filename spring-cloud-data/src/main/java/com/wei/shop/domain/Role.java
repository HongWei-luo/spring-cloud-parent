package com.wei.shop.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@ApiModel(value="com.wei.shop.domain.Role")
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = -1904383182609656316L;
    /**
    * id,使用uuid
    */
    @ApiModelProperty(value="id,使用uuid")
    @TableId(type = IdType.UUID)
    private String id;

    /**
    * 角色名称
    */
    @ApiModelProperty(value="角色名称")
    private String roleName;


    /**
     * 权限
     * */
    private List<Permission> permissions;

    /**
     * 用户
     * */
    private User user;

    private String permissionId;

}