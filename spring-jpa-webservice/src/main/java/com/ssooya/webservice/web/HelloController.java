package com.ssooya.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController -> json을 반환하는 컨트롤러 (기존 RequestBody를 추가하던 것을 생략할 수 있음)
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
}
