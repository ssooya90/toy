package com.ssooya.toy.web.controller;

import com.ssooya.toy.domain.lotto.Lotto;
import com.ssooya.toy.domain.lotto.TestDto;
import com.ssooya.toy.service.game.GameService;
import com.ssooya.toy.web.dto.game.GameLottoInsertDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ssooya90@naver.com on 2020-04-17
 * Github : http://github.com/ssooya90
 */
@RequiredArgsConstructor
@RestController
public class GameController {

	private final GameService gameService;

	/**
	 * Lotto 구매 페이지 이동
	 * @return
	 */
	@GetMapping("/game/lotto")
	public ModelAndView Lotto(){

		return new ModelAndView("/game/lottoMain");
	}


	/**
	 * Lotto 구매
//	 * @param gameLottoInsertDto
	 * @return
	 */
	@PostMapping("/game/lotto/buy")
	public String LottoBuy(@RequestBody List<GameLottoInsertDto> list, @AuthenticationPrincipal User user){

		gameService.lottoInsert(list, user);

		return "test";

	}


}
