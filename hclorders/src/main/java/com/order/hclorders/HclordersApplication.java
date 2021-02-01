package com.order.hclorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(name="hclorders")
@EnableEurekaClient
public class HclordersApplication {

	public static void main(String[] args) {
		SpringApplication.run(HclordersApplication.class, args);
	}

}
