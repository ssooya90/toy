package com.ssooya.jpaBoard.web.board.dto;

import com.ssooya.jpaBoard.domain.board.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponseDto {

	Long id;
	String title;
	String writer;
	String content;
	LocalDateTime modifiedDate;

	// Board entity에서 일부만 사용하기때문에, 생성자롤 eneity를 받아 필드에 넣는다.
	public BoardResponseDto(Board entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.writer = entity.getWriter();
		this.content = entity.getContent();
		this.modifiedDate = entity.getModifiedDate();
	}
}
