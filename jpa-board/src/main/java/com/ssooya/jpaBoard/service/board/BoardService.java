package com.ssooya.jpaBoard.service.board;

import com.ssooya.jpaBoard.domain.board.BoardRepository;
import com.ssooya.jpaBoard.web.board.dto.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BoardService {

	Logger logger = LoggerFactory.getLogger(BoardService.class);


	private final BoardRepository boardRepository;

	@Transactional
	public Long save(BoardSaveRequestDto requestDto){
		return boardRepository.save(requestDto.toEntity()).getId();
	}
}
