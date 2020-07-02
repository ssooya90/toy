package com.ssooya.web.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {



	@RequestMapping("/member/joinProc")
	public String joinProc(){
		return "test";
	}

	@RequestMapping("/member/join")
	public String join(){
		return "/member/join";
	}

}
