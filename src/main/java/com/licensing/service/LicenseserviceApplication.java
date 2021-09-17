package com.licensing.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class LicenseserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LicenseserviceApplication.class, args);
	}

}
