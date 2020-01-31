package com.rodge.microservicesimpleprovideruser.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodge.microservicesimpleprovideruser.pojo.data.user.UserDO;
/**
 * 
* Copyright: Copyright (c) 2019 Relation Network Development Group
* 
* @ClassName: UserRepository.java
* @Description: 用户查询jpa接口
*
* @version: v1.0.0
* @author: rodge
*
* Modification History:
* Date         	Author          Version            Description
*---------------------------------------------------------------------------*
* 2020年1月29日     rodge           v1.0.0               修改原因
 */
public interface UserRepository extends JpaRepository<UserDO, Long> {

	
}
