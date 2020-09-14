package com.ssooya.jpaBoard.web.board;

import com.ssooya.jpaBoard.service.board.BoardService;
import com.ssooya.jpaBoard.web.board.dto.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
