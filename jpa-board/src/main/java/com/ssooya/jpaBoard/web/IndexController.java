package com.ssooya.jpaBoard.web;


import com.ssooya.jpaBoard.domain.board.BoardRepository;
import com.ssooya.jpaBoard.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

	private final BoardService boardService ;


	@GetMapping("/")
	public String main(Model model){

		try{
			model.addAttribute("boardList",boardService.findAllDesc());
		}catch (Exception e){
			e.printStackTrace();
		}

		return "board/list";
	}

}
