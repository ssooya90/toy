package com.ssooya.toy.web.controller;

import com.ssooya.toy.domain.member.Member;
import com.ssooya.toy.domain.member.MemberRepository;
import com.ssooya.toy.service.member.MemberService;
import com.ssooya.toy.web.dto.member.MemberUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class MyInfoController {

	private final PasswordEncoder passwordEncoder;
	private final MemberService memberService;
	private final HttpSession httpSession;

	private final MemberRepository memberRepository;



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
		String userId = user.getUsername();

		// username으로 jpa를 통해, member 객체를 가져와야한다.

		// View에서 username으로 넘겨야 함..!
		Member member = memberRepository.findByUserId(userId)
				.orElseThrow(() -> new UsernameNotFoundException(userId));

		mav.addObject("member",member);

		return mav;
	}

	@GetMapping("/myInfo/delete")
	public ModelAndView myInfoDelete(){

		ModelAndView mav = new ModelAndView("/myInfo/myInfoDelete");
		mav.addObject("activeHeader","delete");

		return mav;
	}

	@PutMapping("/myinfo/update/{userId}")
	public Long update(@PathVariable String userId, @RequestBody MemberUpdateRequestDto requestDto){

		Member member = memberRepository.findByUserId(userId)
				.orElseThrow(() -> new UsernameNotFoundException(userId));

		return memberService.update(member.getId(), requestDto);
	}


//	@PostMapping("/myInfo/deleteProc")
//	public ModelAndView delete(@AuthenticationPrincipal User user){
//
//		ModelAndView mav = new ModelAndView("");
//		mav.addObject("activeHeader","update");
//
//		String userId = user.getUsername();
//
//		// View에서 username으로 넘겨야 함..!
//		Member member = memberRepository.findByUserId(userId)
//				.orElseThrow(() -> new UsernameNotFoundException(userId));
//
//
//		mav.addObject("member",member);
//
//		return mav;
//	}








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
