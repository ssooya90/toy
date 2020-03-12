package com.ssooya.toy.web.controller;

import com.ssooya.toy.web.dto.member.MemberSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@RestController
public class MyInfoController {

	@GetMapping("/myInfo/pwChk")
	public ModelAndView pwChk(){
		return new ModelAndView("/myInfo/pwChk");
	}



}
