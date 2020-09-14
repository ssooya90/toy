package com.ssooya.jpaBoard.web.board.dto;

import com.ssooya.jpaBoard.domain.board.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardListResponseDto {

	Long id;
	String title;
	String writer;
	String content;
	LocalDateTime modifiedDate;

	public BoardListResponseDto(Board entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.writer = entity.getWriter();
		this.content = entity.getContent();
		this.modifiedDate = getModifiedDate();
	}



}
