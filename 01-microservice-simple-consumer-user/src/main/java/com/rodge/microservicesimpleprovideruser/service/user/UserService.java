package com.rodge.microservicesimpleprovideruser.service.user;

import com.rodge.microservicesimpleprovideruser.pojo.dto.user.UserDTO;

/**
 * 
* Copyright: Copyright (c) 2019 Relation Network Development Group
* 
* @ClassName: UserService.java
* @Description: 用户服务接口
*
* @version: v1.0.0
* @author: rodge
*
* Modification History:
* Date         	Author          Version            Description
*---------------------------------------------------------------------------*
* 2020年1月29日     rodge           v1.0.0               修改原因
 */
public interface UserService {
	/**
	 * 根据id查找用户
	 * @param id	用户id
	 * @return	用户dto
	 */
	UserDTO findUserById(String id);

}
