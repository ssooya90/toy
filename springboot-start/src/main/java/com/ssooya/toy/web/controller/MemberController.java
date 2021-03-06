package com.ssooya.toy.web.controller;

import com.ssooya.toy.service.member.MemberService;
import com.ssooya.toy.web.dto.member.MemberResponseDto;
import com.ssooya.toy.web.dto.member.MemberSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class MemberController {

	private final MemberService memberService;
	private final PasswordEncoder passwordEncoder;

	@PostMapping("/api/v1/member")
	public Long save(@RequestBody MemberSaveRequestDto requestDto) {
		requestDto.setPassword(passwordEncoder.encode(requestDto.getPassword()));
		return memberService.save(requestDto);
	}



	@GetMapping("/api/v1/member/{id}")
	public MemberResponseDto findById(@PathVariable Long id) {
		return memberService.findById(id);
	}

}
