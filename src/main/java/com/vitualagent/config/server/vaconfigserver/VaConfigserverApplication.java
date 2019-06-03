package com.vitualagent.config.server.vaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class VaConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaConfigserverApplication.class, args);
	}

}
