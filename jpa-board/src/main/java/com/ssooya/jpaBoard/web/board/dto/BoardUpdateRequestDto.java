package com.ssooya.jpaBoard.web.board.dto;

import com.ssooya.jpaBoard.domain.board.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardUpdateRequestDto {

	private Long id;
	private String title;
	private String writer;
	private String content;

	@Builder
	public BoardUpdateRequestDto(Long id, String writer, String title, String content) {
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	public Board toEntity(){
		return Board.builder()
				.id(id)
				.title(title)
				.writer(writer)
				.content(content)
				.build();
	}



}
