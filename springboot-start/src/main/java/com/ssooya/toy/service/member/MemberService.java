package com.ssooya.toy.service.member;

import com.ssooya.toy.domain.member.Member;
import com.ssooya.toy.domain.member.MemberRepository;
import com.ssooya.toy.web.dto.member.MemberResponseDto;
import com.ssooya.toy.web.dto.member.MemberSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ssooya90@naver.com on 2020-02-24
 * Github : http://github.com/ssooya90
 */
@RequiredArgsConstructor
@Service
public class MemberService {

	private final MemberRepository memberRepository;

	@Transactional
	public Long save(MemberSaveRequestDto requestDto){
		return memberRepository.save(requestDto.toEntity()).getId();
	}



	public MemberResponseDto findById(Long id){
		Member entity = memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
		return new MemberResponseDto(entity);
	}
}
