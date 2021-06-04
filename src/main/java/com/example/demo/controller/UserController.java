package com.example.demo.controller;

import com.example.demo.data.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(value = "UserController", description = "사용자", basePath = "/user")
public class UserController {

  @RequestMapping(value = "", method = RequestMethod.GET)
  @ApiOperation(value = "사용자 목록 조회", notes = "사용자 목록을 조회하는 API")
  public List<User> getUserList(){
    return null;
  }

  @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
  public User getUser(@PathVariable("uid") Long uid){
    return null;
  }

//  @RequestMapping(value = "", method = RequestMethod.POST)
//  public void insertUser(User user){
//    try {
//
//    }catch (){
//
//    }
//  }


}
