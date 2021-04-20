package com.example.springstarter.controller;

import com.example.springstarter.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "User related APIs")
@RequestMapping("/user")
public class UserController {

  @GetMapping("/")
  @ApiOperation("Searching by user id")
  @ApiImplicitParam(name = "id", value = "User Id", defaultValue = "99", required = true)
  public User getUserById(@PathVariable Integer id) {

    User user = new User();
    user.setId(id);

    return user;
  }

  @PutMapping("/{id}")
  @ApiOperation("根据id更新用户的接口")
  public User updateUserById(@RequestBody User user) {

    return user;
  }
}
