package com.ssooya.web.contorller;

import com.ssooya.web.dto.member.MemberSaveRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {



	@PostMapping("/member/joinProc")
	public Long joinProc(@RequestBody MemberSaveRequestDto requestDto){
		return Long.valueOf(1);
	}

	@RequestMapping("/member/join")
	public String join(){
		return "/member/join";
	}

}
