package com.ssooya.jpaBoard.web.comment;

import com.ssooya.jpaBoard.domain.board.Board;
import com.ssooya.jpaBoard.domain.comment.Comment;
import com.ssooya.jpaBoard.service.board.BoardService;
import com.ssooya.jpaBoard.service.comment.CommentService;
import com.ssooya.jpaBoard.web.board.dto.BoardResponseDto;
import com.ssooya.jpaBoard.web.comment.dto.CommentSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class CommentController {

	private final CommentService commentService;
	private final BoardService boardService;


	@RequestMapping("/comment/save")
	@ResponseBody
	public String commentSave(@PathVariable("boardId") Long boardId){

//		Long id = commentService.save(requestDto);
//		BoardResponseDto board = boardService.findById(boardId);


		return "<div>성공</div>";
	}


}
