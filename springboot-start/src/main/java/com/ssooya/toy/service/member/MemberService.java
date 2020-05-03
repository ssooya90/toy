package com.ssooya.toy.service.member;

import com.ssooya.toy.config.SecurityConfig;
import com.ssooya.toy.domain.member.Member;
import com.ssooya.toy.domain.member.MemberRepository;
import com.ssooya.toy.web.dto.member.MemberResponseDto;
import com.ssooya.toy.web.dto.member.MemberSaveRequestDto;
import com.ssooya.toy.web.dto.member.MemberUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ssooya90@naver.com on 2020-02-24
 * Github : http://github.com/ssooya90
 */
@RequiredArgsConstructor
@Service
public class MemberService {

	Logger logger = LoggerFactory.getLogger(SecurityConfig.class);


	private final MemberRepository memberRepository;
	private final PasswordEncoder passwordEncoder;


	/**
	 * 회원가입
	 * @param requestDto
	 * @return
	 */
	@Transactional
	public Long save(MemberSaveRequestDto requestDto){

		Long asdf = null;
		
		try{
			return memberRepository.save(requestDto.toEntity()).getId();
		}catch (Exception e){
			e.printStackTrace();
		}

		return asdf;
	}


	/**
	 * 회원찾기
	 * @param id
	 * @return
	 */
	public MemberResponseDto findById(Long id){
		Member entity = memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 회원이 없습니다." + id));
		return new MemberResponseDto(entity);
	}

	/**
	 * 사용자 정보 업데이트
	 * @param id
	 * @param requestDto
	 * @return id
	 */
	@Transactional
	public Long update(Long id, MemberUpdateRequestDto requestDto){

		Member member = memberRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

		member.update(requestDto.getUserName(), requestDto.getUserAge());


  		return id;
	}

	/**
	 * 사용자 정보 삭제(delete가 아닌 update)
	 * @param id
	 * @param requestDto
	 * @return
	 */

	@Transactional
	public Long delete(Long id, MemberUpdateRequestDto requestDto){

		Member member = memberRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

		member.delete(requestDto.getUserState());

		return id;
	}


//	public MemberResponseDto findByIdAndPw(Long id, String password){
//		// 비밀번호와 아이디..!
//		Member entity = memberRepository.findByIdAndPw(id, password)
//				.orElseThrow(() -> new UsernameNotFoundException(userId));
//
//		if(!passwordEncoder
//				.matches(password, entity.getPassword())) {
//			logger.info("changePassword is Not Equal Current Password");
//			return new ResponseEntity<>(UserRegisterResult.ERROR.getResponseBody(),
//					HttpStatus.FORBIDDEN);
//
//	}
}
