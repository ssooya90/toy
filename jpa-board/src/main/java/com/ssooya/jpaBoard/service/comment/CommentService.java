package com.ssooya.jpaBoard.service.comment;

import com.ssooya.jpaBoard.domain.board.Board;
import com.ssooya.jpaBoard.domain.board.BoardRepository;
import com.ssooya.jpaBoard.domain.comment.CommentRepository;
import com.ssooya.jpaBoard.service.board.BoardService;
import com.ssooya.jpaBoard.web.comment.dto.CommentSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CommentService {

	Logger logger = LoggerFactory.getLogger(CommentService.class);

	private final CommentRepository commentRepository;
	private final BoardRepository boardRepository;


	@Transactional
	public Long save(CommentSaveRequestDto requestDto){

		Board board = boardRepository.findById(Long.valueOf(requestDto.getBoardId())).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다."));

		requestDto = CommentSaveRequestDto.builder()
				.board(board)
				.writer(requestDto.getWriter())
				.content(requestDto.getContent())
				.build();

		return commentRepository.save(requestDto.toEntity()).getId();
	}

}
