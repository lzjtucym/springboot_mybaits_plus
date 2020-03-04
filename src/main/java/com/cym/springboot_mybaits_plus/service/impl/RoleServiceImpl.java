package com.cym.springboot_mybaits_plus.service.impl;

import com.cym.springboot_mybaits_plus.entity.Role;
import com.cym.springboot_mybaits_plus.mapper.RoleMapper;
import com.cym.springboot_mybaits_plus.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
