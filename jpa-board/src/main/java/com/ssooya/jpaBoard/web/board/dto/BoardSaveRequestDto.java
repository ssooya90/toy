package com.ssooya.jpaBoard.web.board.dto;

import com.ssooya.jpaBoard.domain.board.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BoardSaveRequestDto {

	private String title;
	private String writer;
	private String content;

	@Builder
	public BoardSaveRequestDto(String writer, String title, String content) {
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	public Board toEntity(){
		return Board.builder()
				.title(title)
				.writer(writer)
				.content(content)
				.build();
	}



}
