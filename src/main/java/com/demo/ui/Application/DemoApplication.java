package com.demo.ui.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author raguram.maniyarasu
 *
 */
@ComponentScan("com.demo.ui")
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		
	}

}