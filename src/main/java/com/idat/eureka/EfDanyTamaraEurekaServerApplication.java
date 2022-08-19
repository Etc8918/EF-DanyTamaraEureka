package com.idat.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfDanyTamaraEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDanyTamaraEurekaServerApplication.class, args);
	}

}
