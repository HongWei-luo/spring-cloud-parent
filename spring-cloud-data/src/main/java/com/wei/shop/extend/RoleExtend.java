package com.wei.shop.extend;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wei.shop.domain.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@ApiModel(value="com.wei.shop.domain.Role")
@Data
public class RoleExtend implements Serializable {
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
    private List<PermissionExtend> permissions;

    /**
     * 用户
     * */
    private User user;

}