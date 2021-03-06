package com.rodge.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
* Copyright: Copyright (c) 2019 Relation Network Development Group
* 
* @ClassName: EurekaServerAuthenticatingApplication.java
* @Description: eureka server添加安全认证
*
* @version: v1.0.0
* @author: rodge
*
* Modification History:
* Date         	Author          Version            Description
*---------------------------------------------------------------------------*
* 2020年2月1日     rodge           v1.0.0               修改原因
 */
@SpringBootApplication
@EnableEurekaServer	
public class EurekaServerAuthenticatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAuthenticatingApplication.class, args);
	}

}
