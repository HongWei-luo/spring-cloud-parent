package com.wei.shop.extend;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value="com.wei.shop.domain.Permission")
@Data
public class PermissionExtend implements Serializable {

    private static final long serialVersionUID = -1237879283939077503L;


    @ApiModelProperty(value="null")
    @TableId(type = IdType.UUID)
    private String id;

    @ApiModelProperty(value="null")
    private String permission;

    /**
     * 角色
     * */
    private RoleExtend role;
}