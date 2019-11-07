package com.cym.springboot_mybaits_plus.service;

import com.cym.springboot_mybaits_plus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cym
 * @since 2019-11-05
 */
public interface IUserService extends IService<User> {

  /**
   * 根据用户状态查询用户
   * @param status -1：全部，0：注销，1：正常，2：删除，3：冻结
   * @return
   */
  List<User> queryUserByStatus(int status);

}
