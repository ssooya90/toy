package com.ssooya.toy.service.game;

import com.ssooya.toy.config.SecurityConfig;
import com.ssooya.toy.domain.board.BoardRepository;
import com.ssooya.toy.domain.lotto.LottoRepository;
import com.ssooya.toy.domain.member.Member;
import com.ssooya.toy.domain.member.MemberRepository;
import com.ssooya.toy.web.dto.game.GameLottoInsertDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by ssooya90@naver.com on 2020-05-06
 * Github : http://github.com/ssooya90
 */

@RequiredArgsConstructor
@Service
public class GameService {

	Logger logger = LoggerFactory.getLogger(SecurityConfig.class);

	private final LottoRepository lottoRepository;
	private final MemberRepository memberRepository;


	@Transactional
	public void lottoInsert(List<GameLottoInsertDto> list, User user) {

		Optional<Member> member = memberRepository.findByUserId(user.getUsername());

		for(int i = 0 ; i < list.size() ; i++){

		}


	}
}
