package com.fahrul.springgooglecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class SpringGoogleCloudApplication extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringGoogleCloudApplication.class, args);
	}

}
