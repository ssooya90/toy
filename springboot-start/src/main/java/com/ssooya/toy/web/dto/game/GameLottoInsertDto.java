package com.ssooya.toy.web.dto.game;

import com.ssooya.toy.domain.lotto.Lotto;
import com.ssooya.toy.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by ssooya90@naver.com on 2020-04-24
 * Github : http://github.com/ssooya90
 */

@Getter
public class GameLottoInsertDto {



	private String userId;
	private int lotto1;
	private int lotto2;
	private int lotto3;
	private int lotto4;
	private int lotto5;
	private int lotto6;


	@Builder
	public GameLottoInsertDto(String userId, int lotto1, int lotto2, int lotto3, int lotto4, int lotto5, int lotto6){
		this.userId = userId;
		this.lotto1 = lotto1;
		this.lotto2 = lotto2;
		this.lotto3 = lotto3;
		this.lotto4 = lotto4;
		this.lotto5 = lotto5;
		this.lotto6 = lotto6;
	}


}
