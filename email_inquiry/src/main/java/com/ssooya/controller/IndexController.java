package com.ssooya.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssooya90@naver.com on 2020-05-22
 * Github : http://github.com/ssooya90
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
