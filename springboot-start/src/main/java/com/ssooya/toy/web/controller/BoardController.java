package com.ssooya.toy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	/**
	 * 게시판 조회
	 * @param model
	 * @return
	 */
	@GetMapping("/board")
	public String board(Model model){

		return "/board/boardList";
	}


}
