package com.ssooya.jpaBoard.service.comment;

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


	@Transactional
	public Long save(CommentSaveRequestDto requestDto){
		return commentRepository.save(requestDto.toEntity()).getId();
	}

}
