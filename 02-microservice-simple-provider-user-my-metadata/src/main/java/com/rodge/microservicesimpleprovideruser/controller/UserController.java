package com.rodge.microservicesimpleprovideruser.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodge.microservicesimpleprovideruser.pojo.dto.user.UserDTO;
import com.rodge.microservicesimpleprovideruser.service.user.UserService;

/**
 * 
* Copyright: Copyright (c) 2019 Relation Network Development Group
* 
* @ClassName: UserController.java
* @Description: 查询用户信息
*
* @version: v1.0.0
* @author: rodge
*
* Modification History:
* Date         	Author          Version            Description
*---------------------------------------------------------------------------*
* 2020年1月29日     rodge           v1.0.0               修改原因
 */
@RestController
@RequestMapping("/user")
public class UserController {

	
	@Resource
	UserService userService;
	
	@GetMapping("/{id}")
	public UserDTO findUserById(@PathVariable String id) {
		return userService.findUserById(id);
	}
}
