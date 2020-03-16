package com.ssooya.toy.web.controller;

import com.ssooya.toy.domain.member.Member;
import com.ssooya.toy.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@RequiredArgsConstructor
@RestController
public class MyInfoController {

	private final PasswordEncoder passwordEncoder;
	private final MemberService memberService;
	private final HttpSession httpSession;


	@GetMapping("/myInfo/pwChk")
	public ModelAndView pwChk(){

		return new ModelAndView("/myInfo/pwChk");
	}

	@GetMapping("/myInfo/")
	public ModelAndView myInfo(){

		return new ModelAndView("/myInfo/infoMain");
	}

	@GetMapping("/myInfo/update")
	public ModelAndView myInfoUpdate(@AuthenticationPrincipal User user){

		ModelAndView mav = new ModelAndView("/myInfo/myInfoUpdate");
		mav.addObject("activeHeader","update");
		String username = user.getUsername();

		// username으로 jpa를 통해, member 객체를 가져와야한다.







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
