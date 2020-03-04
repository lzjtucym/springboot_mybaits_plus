package com.cym.springboot_mybaits_plus.service.impl;

import com.cym.springboot_mybaits_plus.entity.UserRole;
import com.cym.springboot_mybaits_plus.mapper.UserRoleMapper;
import com.cym.springboot_mybaits_plus.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cym
 * @since 2019-12-07
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
