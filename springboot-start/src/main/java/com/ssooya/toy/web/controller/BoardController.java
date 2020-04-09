package com.ssooya.toy.web.controller;

import com.ssooya.toy.domain.board.Board;
import com.ssooya.toy.domain.board.BoardRepository;
import com.ssooya.toy.domain.member.MemberRepository;
import com.ssooya.toy.service.board.BoardService;
import com.ssooya.toy.web.dto.board.BoardResponseDto;
import com.ssooya.toy.web.dto.board.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

	private final BoardService boardService;
	private final BoardRepository boardRepository;


	/**
	 * 게시판 조회
	 * @param mav
	 * @return
	 */
	@GetMapping("/board")
	public ModelAndView board(ModelAndView mav){

		mav.setViewName("/board/boardList");
		mav.addObject("listData",boardService.findAllDesc());

		return mav;
	}



	@GetMapping("/board/{id}")
	public ModelAndView boardView(@PathVariable Long id, ModelAndView mav){

		mav.addObject("board",boardService.findById(id));

		Board board = boardRepository.findById(id).orElseThrow(() -> new NullPointerException());
		boardService.hitUpdate(board.getId());


		mav.setViewName("/board/boardView");



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
