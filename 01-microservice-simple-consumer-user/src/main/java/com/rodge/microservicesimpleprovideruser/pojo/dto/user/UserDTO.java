package com.rodge.microservicesimpleprovideruser.pojo.dto.user;

import lombok.Data;
import lombok.ToString;
/**
 * 
* Copyright: Copyright (c) 2019 Relation Network Development Group
* 
* @ClassName: UserDTO.java
* @Description: 用户转换类
*
* @version: v1.0.0
* @author: rodge
*
* Modification History:
* Date         	Author          Version            Description
*---------------------------------------------------------------------------*
* 2020年1月29日     rodge           v1.0.0               修改原因
 */
@Data
@ToString
public class UserDTO {
	private String id;
	private String username;
	private String name;
	private Integer age;
	private Double balance;
}
