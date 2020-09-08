package com.ssooya.web.contorller;

import com.ssooya.service.member.MemberService;
import com.ssooya.web.dto.member.MemberSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MemberController {

	private final MemberService memberService;

	@PostMapping("/member/joinProc")
	public Long joinProc(@RequestBody MemberSaveRequestDto requestDto){
		return memberService.joinProc(requestDto);
	}

	@RequestMapping("/member/join")
	public String join(){
		return "/member/join";
	}

}
