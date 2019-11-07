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
 *  用户信息
 * </p>
 *
 * @author cym
 * @since 2019-11-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("test_user")
@ApiModel(value = "User", description = "用户信息")
public class User extends Model<User> {

  private static final long serialVersionUID = 1L;

  @TableId(value = "userId", type = IdType.AUTO)
  private Integer userId;

  @TableField("userName")
  private String userName;

  @TableField("trueName")
  private String trueName;

  private String password;

  private String sex;

  private Integer age;

  private String phone;

  private String email;

  private String address;

  private String city;

  @TableField("roleId")
  private Integer roleId;

  private String dept;

  @TableField("deptId")
  private Integer deptId;

  @ApiModelProperty(value = "状态（-1：全部，0：正常，1：注销，2：删除，3：冻结）")
  private Integer status;

}
