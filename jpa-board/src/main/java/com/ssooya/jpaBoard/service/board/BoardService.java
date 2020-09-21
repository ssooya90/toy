package com.ssooya.jpaBoard.service.board;

import com.ssooya.jpaBoard.domain.board.Board;
import com.ssooya.jpaBoard.domain.board.BoardRepository;
import com.ssooya.jpaBoard.web.board.dto.BoardListResponseDto;
import com.ssooya.jpaBoard.web.board.dto.BoardResponseDto;
import com.ssooya.jpaBoard.web.board.dto.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardService {

	Logger logger = LoggerFactory.getLogger(BoardService.class);


	private final BoardRepository boardRepository;

	@Transactional
	public Long save(BoardSaveRequestDto requestDto){
		return boardRepository.save(requestDto.toEntity()).getId();
	}

	@Transactional(readOnly = true)
	public List<BoardListResponseDto> findAllDesc() throws Exception{

		List list = boardRepository.findAllDesc();

		// board entity를 list로 받아서 BoardListResponseDto로 변환하여 전달한다.

		return boardRepository.findAllDesc().stream().map(BoardListResponseDto::new).collect(Collectors.toList());

	}




	@Transactional(readOnly = true)
	public BoardResponseDto findById(Long id) {

		Board entity = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다."));

		return new BoardResponseDto(entity);

	}

	@Transactional(readOnly = true)
	public Page findBooksByPageRequest(Pageable pageable) {

		return boardRepository.findAll(pageable);

	}
}
