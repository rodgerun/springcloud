package com.rodge.microservicesimpleprovideruser.service.user.impl;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rodge.microservicesimpleprovideruser.dao.user.UserRepository;
import com.rodge.microservicesimpleprovideruser.pojo.data.user.UserDO;
import com.rodge.microservicesimpleprovideruser.pojo.dto.user.UserDTO;
import com.rodge.microservicesimpleprovideruser.service.user.UserService;
/**
 * 
* Copyright: Copyright (c) 2019 Relation Network Development Group
* 
* @ClassName: UserServiceImpl.java
* @Description: 用户服务实现类
*
* @version: v1.0.0
* @author: rodge
*
* Modification History:
* Date         	Author          Version            Description
*---------------------------------------------------------------------------*
* 2020年1月29日     rodge           v1.0.0               修改原因
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	UserRepository userRepository;
	/**
	 * 根据用户id查用户
	 */
	@Override
	public UserDTO findUserById(String id) {
		UserDTO userDTO = null;
		Optional<UserDO> userOptional = userRepository.findById(Long.parseLong(id));
		if (userOptional.isPresent()) {
			UserDO userDO = userOptional.get();
			
			userDTO = new UserDTO();
			
			userDTO.setId(id);
			userDTO.setName(userDO.getName());
			userDTO.setUsername(userDO.getUsername());
			userDTO.setAge(userDO.getAge());
			userDTO.setBalance(userDO.getBalance());
			
		}
		return userDTO;
	}

}
