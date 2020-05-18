package com.ssooya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ssooya90@naver.com on 2020-05-18
 * Github : http://github.com/ssooya90
 */
@SpringBootApplication
public class Application {

	public static final String APPLICATION_LOCATIONS = "spring.config.location=" + "classpath:application.yml,"
			+ "/Users/kyunam/Documents/spring-config/real-application.yml";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
