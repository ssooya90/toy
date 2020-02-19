package com.ssooya.toy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssooya90@naver.com on 2020-02-19
 * Github : http://github.com/ssooya90
 */

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(){
		return "Hello Wolrd!";
	}
}
