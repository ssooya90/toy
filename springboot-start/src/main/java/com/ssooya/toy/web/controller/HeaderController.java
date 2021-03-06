package com.ssooya.toy.web.controller;

import com.ssooya.toy.web.dto.member.MemberSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssooya90@naver.com on 2020-02-26
 * Github : http://github.com/ssooya90
 */
@RequiredArgsConstructor
@Controller
public class HeaderController {

	@GetMapping("/member/signUp")
	public String memberJoin() {
		return "/member/signUp";
	}

	@RequestMapping("/member/signIn")
	public String memberLogin() {
		return "/member/signIn";
	}

	@GetMapping("/loginSuccess")
	public String loginSuccess(Model model) {
		return "/member/loginSuccess";
	}


}
