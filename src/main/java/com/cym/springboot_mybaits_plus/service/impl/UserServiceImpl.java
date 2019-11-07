package com.cym.springboot_mybaits_plus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cym.springboot_mybaits_plus.entity.User;
import com.cym.springboot_mybaits_plus.mapper.UserMapper;
import com.cym.springboot_mybaits_plus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author cym
 * @since 2019-11-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

  @Override
  public List<User> queryUserByStatus(int status) {
    QueryWrapper queryWrapper = new QueryWrapper();
    queryWrapper.eq("status", status);
    return this.list(queryWrapper);
  }
}
