package example.domain.web;

import example.domain.member.MemberService;
import example.domain.member.dto.MemberRequestDto;
import example.domain.member.dto.MemberResponseDto;
import example.domain.member.dto.ValidTestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MemberController {

	private MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@PostMapping("/member")
	public Long saveMember(@RequestBody @Valid MemberRequestDto memberRequestDto) {
		return memberService.save(memberRequestDto);
	}

	@GetMapping("/members")
	public List<MemberResponseDto> findAll(){
		return memberService.findAll();
	}

	@PostMapping("/test")
	public ValidTestDto validTest(@Valid ValidTestDto validTestDto){
		return validTestDto;
	}

}