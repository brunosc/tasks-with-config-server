package br.com.teste.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerSchedulingTaskTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerSchedulingTaskTestApplication.class, args);
	}
}
