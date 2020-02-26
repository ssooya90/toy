package com.ssooya.toy.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ssooya90@naver.com on 2020-02-26
 * Github : http://github.com/ssooya90
 */
@RequiredArgsConstructor
@Controller
public class HeaderController {


	@GetMapping("/member/join")
	public String memberJoin(){
		return "/member/join";
	}

}
