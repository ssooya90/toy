package com.ssooya.toy.service.board;


import com.ssooya.toy.config.SecurityConfig;
import com.ssooya.toy.domain.board.Board;
import com.ssooya.toy.domain.board.BoardRepository;
import com.ssooya.toy.web.dto.board.BoardListResponseDto;
import com.ssooya.toy.web.dto.board.BoardResponseDto;
import com.ssooya.toy.web.dto.board.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardService {

	Logger logger = LoggerFactory.getLogger(SecurityConfig.class);

	private final BoardRepository boardRepository;


	@Transactional
	public Long save(BoardSaveRequestDto requestDto) {
		return boardRepository.save(requestDto.toEntity()).getId();
	}



	@Transactional
	public List<BoardListResponseDto> findAllDesc() {
		return boardRepository.findAllDesc().stream()
				.map(BoardListResponseDto::new)
				.collect(Collectors.toList());
	}

	public BoardResponseDto findById(Long id){
		Board entity = boardRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id +=" + id));

		return new BoardResponseDto(entity);
	}


	@Transactional
	public void hitUpdate(Long id) {

		Board board = boardRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 게시물이 없습니다."));

		board.hitUpdate(id);

	}
}
