package com.ssooya.spring.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing // 배치 기능 활성화 (필수 선언)
@SpringBootApplication
public class BatchApplication {

	public static void main(String[] args){
		SpringApplication.run(BatchApplication.class, args);
	}
}
