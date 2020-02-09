package example.domain.member;

import example.domain.member.dto.MemberRequestDto;
import example.domain.member.dto.MemberResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {

	private MemberRepository memberRepository;

	public MemberService(MemberRepository memberRepositry){
		this.memberRepository = memberRepositry;
	}

	@Transactional
	public Long save(MemberRequestDto memberRequestDto){
		return memberRepository.save(memberRequestDto.toEntity()).getId();
	}

	@Transactional(readOnly = true)
	public List<MemberResponseDto> findAll(){
		return memberRepository
				.findAll()
				.stream()
				.map(MemberResponseDto::new)
				.collect(Collectors.toList());
	}
}
