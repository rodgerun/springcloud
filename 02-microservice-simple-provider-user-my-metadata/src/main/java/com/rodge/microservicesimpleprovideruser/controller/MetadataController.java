package com.rodge.microservicesimpleprovideruser.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
* Copyright: Copyright (c) 2019 Relation Network Development Group
* 
* @ClassName: MetadataController.java
* @Description: 元数据信息
*
* @version: v1.0.0
* @author: rodge
*
* Modification History:
* Date         	Author          Version            Description
*---------------------------------------------------------------------------*
* 2020年2月2日     rodge           v1.0.0               修改原因
 */

@RestController
@RequestMapping("/metadata")
public class MetadataController {
	
	@Resource
	DiscoveryClient discoveryClient;
	
	@GetMapping("/user-instance")
	public List<ServiceInstance> showInfo() {
		return discoveryClient.getInstances("provider-user");
	}

}
