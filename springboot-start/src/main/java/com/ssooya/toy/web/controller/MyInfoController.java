package com.ssooya.toy.web.controller;

import com.ssooya.toy.web.dto.member.MemberSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@RestController
public class MyInfoController {

	private final PasswordEncoder passwordEncoder;


	@GetMapping("/myInfo/pwChk")
	public ModelAndView pwChk(){

		return new ModelAndView("/myInfo/pwChk");
	}

	@PostMapping("/myInfo/pwChk")
	public void save(@RequestBody MemberSaveRequestDto requestDto) {
		requestDto.setPassword(passwordEncoder.encode(requestDto.getPassword()));
		System.out.println("1");
//		return memberService.save(requestDto);
	}


}
