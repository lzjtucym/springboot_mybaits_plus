package com.cym.springboot_mybaits_plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *  菜单
 * </p>
 *
 * @author cym
 * @since 2019-12-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("syn_menu")
@ApiModel(value = "Menu对象", description = "")
public class Menu extends Model {

  private static final long serialVersionUID = 1L;

  @TableId("menuId")
  private Integer menuId;

  private Boolean available;

  private String name;

  private Long parentId;

  private String parentIds;

  private String permission;

  private String resourceType;

  private String url;

}
