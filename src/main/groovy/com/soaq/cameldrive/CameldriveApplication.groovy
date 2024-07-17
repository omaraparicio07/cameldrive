package com.soaq.cameldrive

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = "com.soaq.cameldrive")
class CameldriveApplication {

	static void main(String[] args) {
		SpringApplication.run(CameldriveApplication, args)
	}

}
