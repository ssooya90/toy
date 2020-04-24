package com.ssooya.toy.web.dto.game;

import com.ssooya.toy.domain.lotto.Lotto;
import com.ssooya.toy.domain.member.Member;
import lombok.Getter;

import java.util.List;

/**
 * Created by ssooya90@naver.com on 2020-04-24
 * Github : http://github.com/ssooya90
 */

@Getter
public class GameLottoInsertDto {

	private List<Lotto> lottoList;

	public GameLottoInsertDto(List<Lotto> entity){
		this.lottoList = entity;

	}

}
