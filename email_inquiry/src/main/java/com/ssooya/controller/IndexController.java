package com.ssooya.controller;


import com.ssooya.service.EmailService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by ssooya90@naver.com on 2020-05-22
 * Github : http://github.com/ssooya90
 */

@RequiredArgsConstructor
@Controller
public class IndexController {

	 private final EmailService emailService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/mailSend", method = RequestMethod.POST)
	@ResponseBody
	public String mailSend(@RequestParam Map pMap){
		return emailService.sendMail(pMap);
	}
}
