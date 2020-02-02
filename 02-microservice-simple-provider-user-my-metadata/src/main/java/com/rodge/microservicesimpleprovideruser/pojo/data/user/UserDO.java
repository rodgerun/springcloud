package com.rodge.microservicesimpleprovideruser.pojo.data.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * 
* Copyright: Copyright (c) 2019 Relation Network Development Group
* 
* @ClassName: UserDO.java
* @Description: 用户实体类
*
* @version: v1.0.0
* @author: rodge
*
* Modification History:
* Date         	Author          Version            Description
*---------------------------------------------------------------------------*
* 2020年1月29日     rodge           v1.0.0               修改原因
 */
@Table(name="user")
@Entity
@Data
@ToString
public class UserDO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String username;
	@Column
	private String name;
	@Column
	private Integer age;
	@Column
	private Double balance;
}
