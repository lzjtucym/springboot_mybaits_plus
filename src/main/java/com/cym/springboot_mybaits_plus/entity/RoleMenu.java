package com.cym.springboot_mybaits_plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *  用户菜单
 * </p>
 *
 * @author cym
 * @since 2019-12-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("syn_role_menu")
@ApiModel(value = "RoleMenu对象", description = "")
public class RoleMenu extends Model {

  private static final long serialVersionUID = 1L;

  private Integer menuId;

  private Integer roleId;

}
