package com.ssooya.jpaBoard.web.board;

import com.ssooya.jpaBoard.domain.board.Board;
import com.ssooya.jpaBoard.service.board.BoardService;
import com.ssooya.jpaBoard.web.board.dto.BoardResponseDto;
import com.ssooya.jpaBoard.web.board.dto.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class BoardController {

	private final BoardService boardService;

	@GetMapping("/post")
	public String write(){
		return "board/write";
	}

	@PostMapping("/post")
	@ResponseBody
	public String write(@RequestBody BoardSaveRequestDto requestDto) {

		try{
			boardService.save(requestDto);
		}catch (Exception e){
			e.printStackTrace();
		}


		return "<div>성공</div>";
	}

	@GetMapping("/post/{id}")
	public String detail(@PathVariable("id") Long id, Model model) {

		model.addAttribute("boardDto", boardService.findById(id));
		return "board/update.html";
	}



}
