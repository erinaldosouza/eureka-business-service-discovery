package br.com.tcc.business.service.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaBusinessServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaBusinessServiceDiscoveryApplication.class, args);
	}

}
