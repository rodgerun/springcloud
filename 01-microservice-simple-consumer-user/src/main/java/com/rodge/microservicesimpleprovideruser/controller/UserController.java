package com.rodge.microservicesimpleprovideruser.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rodge.microservicesimpleprovideruser.pojo.dto.user.UserDTO;

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
	RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public UserDTO findUserById(@PathVariable String id) {
		UserDTO userDTO = restTemplate.getForObject("http://127.0.0.1:8000/user/"+id, UserDTO.class);
		return userDTO;
	}
}
