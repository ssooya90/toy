package com.ssooya.toy.web.controller;

import com.ssooya.toy.service.board.BoardService;
import com.ssooya.toy.web.dto.board.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

	private final BoardService boardService;

	/**
	 * 게시판 조회
	 * @param mav
	 * @return
	 */
	@GetMapping("/board")
	public ModelAndView board(ModelAndView mav){

		mav.setViewName("/board/boardList");
		mav.addObject("listData",boardService.findAllDesc());

		System.out.println("테스트");
		System.out.println("테스트");
		System.out.println("테스트");

		return mav;
	}


	/**
	 * 게시판 조회
	 * @return
	 */
	@GetMapping("/board/boardWrite")
	public ModelAndView boardWrite(){
		return new ModelAndView("/board/boardWrite");

	}

	@PostMapping("/board/save")
	public Long boardSave(@RequestBody BoardSaveRequestDto requestDto){
		return boardService.save(requestDto);
	}



}
