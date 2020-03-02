package com.ssooya.toy.web.controller;

import com.ssooya.toy.domain.member.Member;
import com.ssooya.toy.domain.member.MemberRepository;
import com.ssooya.toy.service.member.MemberService;
import com.ssooya.toy.web.dto.member.MemberResponseDto;
import com.ssooya.toy.web.dto.member.MemberSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by ssooya90@naver.com on 2020-02-24
 * Github : http://github.com/ssooya90
 */

@RequiredArgsConstructor
@RestController
public class MemberController {

	private final MemberService memberService;
	private final MemberRepository memberRepository;
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
