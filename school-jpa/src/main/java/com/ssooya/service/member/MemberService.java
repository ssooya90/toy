package com.ssooya.service.member;

import com.ssooya.domain.member.MemberRepository;
import com.ssooya.web.dto.member.MemberSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {

	Logger logger = LoggerFactory.getLogger(MemberService.class);

	private final MemberRepository memberRepository;

	@Transactional
	public Long joinProc(MemberSaveRequestDto requestDto) {

		Long id = null;

		try{
			id = memberRepository.save(requestDto.toEntity()).getId();
		}catch (Exception e){
			e.printStackTrace();
		}

		return id;
	}
}
