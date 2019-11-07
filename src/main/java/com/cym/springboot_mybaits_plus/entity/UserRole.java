package com.cym.springboot_mybaits_plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户角色
 * </p>
 *
 * @author cym
 * @since 2019-11-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("test_user_role")
@ApiModel(value = "UserRole对象", description = "用户角色")
public class UserRole extends Model {

  private static final long serialVersionUID = 1L;

  @TableId(value = "roleId", type = IdType.AUTO)
  private Integer roleId;

  private String name;

  @TableField("createTime")
  private LocalDateTime createTime;

  private String description;


}
