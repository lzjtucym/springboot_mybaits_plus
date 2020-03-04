package com.cym.springboot_mybaits_plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *  角色表
 * </p>
 *
 * @author cym
 * @since 2019-12-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("syn_role")
@ApiModel(value = "Role对象", description = "")
public class Role extends Model {

  private static final long serialVersionUID = 1L;

  @TableId(value = "roleId", type = IdType.AUTO)
  private Integer roleId;

  @ApiModelProperty(value = "角色标识程序中判断使用,这个是唯一的:")
  @TableField("roleName")
  private String roleName;

  @ApiModelProperty(value = "角色描述,UI界面显示使用")
  private String description;

  @ApiModelProperty(value = "是否可用（1：true，0：false")
  private Integer available;

}
