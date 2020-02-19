package com.ssooya.toy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ssooya90@naver.com on 2020-02-19
 * Github : http://github.com/ssooya90
 */

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "Hello, Spring boot!";
	}

}