package com.ssooya.toy.web.controller;

import com.ssooya.toy.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@RestController
public class MyInfoController {

	private final PasswordEncoder passwordEncoder;

	private final MemberService memberService;


	@GetMapping("/myInfo/pwChk")
	public ModelAndView pwChk(){

		return new ModelAndView("/myInfo/pwChk");
	}

	@GetMapping("/myInfo/")
	public ModelAndView myInfo(){

		return new ModelAndView("/myInfo/infoMain");
	}

	@GetMapping("/myInfo/update")
	public ModelAndView myInfoUpdate(){

		ModelAndView mav = new ModelAndView("/myInfo/myInfoUpdate");
		mav.addObject("activeHeader","update");

		return mav;
	}

//	@PostMapping("/myInfo/pwChk")
//	public MemberResponseDto pwChk(@RequestBody MemberSaveRequestDto requestDto) {
//
//		requestDto.setPassword(passwordEncoder.encode(requestDto.getPassword()));
//
//		return memberService.findByIdAndPw(requestDto.getUserId(),requestDto.getPassword());
//
//
//
//	}


}
