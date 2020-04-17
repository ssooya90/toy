package com.ssooya.toy.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ssooya90@naver.com on 2020-04-17
 * Github : http://github.com/ssooya90
 */

@RestController
public class GameController {


	@GetMapping("/game/lotto")
	public ModelAndView Lotto(){

		return new ModelAndView("/game/lottoMain");
	}


}
