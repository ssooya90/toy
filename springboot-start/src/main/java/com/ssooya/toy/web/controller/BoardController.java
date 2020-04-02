package com.ssooya.toy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {

	/**
	 * 게시판 조회
	 * @param model
	 * @return
	 */
	@GetMapping("/board")
	public String board(Model model){

		List list = new ArrayList();

		model.addAttribute("listData",list);
		model.addAttribute("test","test");

		return "/board/boardList";
	}


	/**
	 * 게시판 조회
	 * @param model
	 * @return
	 */
	@GetMapping("/board/boardWrite")
	public String boardWrite(Model model){

		return "/board/boardWrite";
	}




}
