package com.hcl.orders.hclOrdersnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(name="hclorders")
@EnableEurekaClient
public class HclOrdersnewApplication {

	public static void main(String[] args) {
		SpringApplication.run(HclOrdersnewApplication.class, args);
	}

}
