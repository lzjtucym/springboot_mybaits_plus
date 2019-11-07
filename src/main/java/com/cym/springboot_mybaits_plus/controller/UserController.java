package com.cym.springboot_mybaits_plus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cym.springboot_mybaits_plus.common.SystemsConstant;
import com.cym.springboot_mybaits_plus.entity.User;
import com.cym.springboot_mybaits_plus.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author cym
 * @since 2019-11-05
 */
@Log4j
@Api(tags = "", description = "userInfo")
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private IUserService userService;

  @ApiOperation(value = "查询所有用户", notes = "根据用户状态status(-1：全部，0：注销，1：正常，2：删除，3：冻结)查询用户")
  @ApiImplicitParam(name = "status", value = "用户状态status", required = true, dataType = "int")
  @GetMapping("/allUserInfo")
  public R<List<User>> getAllUserInfo(@RequestParam int status) {
    List<User> userList = userService.queryUserByStatus(status);
    return userList.size() > 0 ? R.ok(userList) : R.failed("查所有用户失败");
  }

  @ApiOperation(value = "通过用户id查询用户", notes = "用户查询")
  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "int")
  @GetMapping("/getUserInfo")
  public R<User> getUserByUserId(@RequestParam int userId) {
    User user = userService.getById(userId);
    return user != null ? R.ok(user) : R.failed("通过userId=" + userId + "查询到的用户为空");
  }

  @ApiOperation(value = "通过用户ids查询用户", notes = "用户批量查询")
  @ApiImplicitParam(name = "userIds", value = "用户id，通过逗号隔开", required = true, dataType = "String")
  @GetMapping("/getUserByIds")
  public R<List<User>> getUserByIds(@RequestParam String userIds) {
    if (StringUtils.isEmpty(userIds)) {
      return R.failed("userIds为空");
    }
    String[] userIdsArr = userIds.split(",");
    List<String> userParamIds = Stream.of(userIdsArr).collect(Collectors.toList());
    return userService.listByIds(userParamIds).size() > 0 ? R.ok((List<User>) userService.listByIds(userParamIds)) : R.failed("通过userId=" + userIds + "查询到的用户为空");
  }

  @ApiOperation(value = "分页查询", notes = "分页查询")
  @ApiImplicitParams({
          @ApiImplicitParam(name = "currentPage", value = "当前页数", required = true,
                  dataType = "int"),
          @ApiImplicitParam(name = "pageSize", value = "每页条数", required = true, dataType = "int")})
  @GetMapping("/getUserPage")
  public R<IPage<User>> getUserPage(@RequestParam int currentPage, @RequestParam int pageSize) {
    Page<User> page = new Page<>(currentPage, pageSize);
    try {
      IPage<User> userIPage = userService.page(page, new QueryWrapper<User>()
              .ge("status", 0).le("status", 1));
      return R.ok(userIPage);
    } catch (Exception e) {
      e.printStackTrace();
      return R.failed("分页查询失败！");
    }
  }

  @ApiOperation(value = "添加用户", notes = "添加用户")
  @ApiImplicitParam(name = "user", value = "对象", required = true, dataType = "User")
  @PostMapping("/addUser")
  public R<User> addUser(@RequestBody User user) {
    return userService.save(user) ? R.ok(null) : R.failed(SystemsConstant.FAIL);
  }

  @ApiOperation(value = "删除用户", notes = "通过用户id删除用户")
  @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "int")
  @DeleteMapping("/removeUser")
  public R<User> removeUser(@RequestParam int userId) {
    return userService.removeById(userId) ? R.ok(null) : R.failed(SystemsConstant.FAIL);
  }

  @ApiOperation(value = "批量删除用户", notes = "通过用户id批量删除用户")
  @ApiImplicitParam(name = "userIds", value = "用户id，通过逗号隔开", required = true, dataType = "String")
  @DeleteMapping("/deleteUserBatchIds")
  public R<User> deleteUserBatchIds(@RequestParam String userIds) {
    if (StringUtils.isEmpty(userIds)) {
      return R.failed("userIds为空");
    }
    String[] userIdsArr = userIds.split(",");
    List<String> userList = Stream.of(userIdsArr).collect(Collectors.toList());
    return userService.removeByIds(userList) ? R.ok(null) : R.failed(SystemsConstant.FAIL);
  }

  @ApiOperation(value = "更新用户", notes = "通过用户id更新用户")
  @ApiImplicitParam(name = "user", value = "对象", required = true, dataType = "User")
  @PostMapping("/updateUserById")
  public R<User> updateUserById(@RequestBody User user) {
    return userService.updateById(user) ? R.ok(null) : R.failed("修改失败");
  }

}
