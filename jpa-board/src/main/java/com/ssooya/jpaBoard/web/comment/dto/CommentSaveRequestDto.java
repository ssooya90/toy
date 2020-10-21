package com.ssooya.jpaBoard.web.comment.dto;

import com.ssooya.jpaBoard.domain.board.Board;
import com.ssooya.jpaBoard.domain.comment.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentSaveRequestDto {

	private Board board;
	private String boardId;
	private String writer;
	private String content;

	@Builder
	public CommentSaveRequestDto(String boardId, String writer, String content){
		this.boardId = boardId;
		this.writer = writer;
		this.content = content;
	}

	public Comment toEntity(){
		return Comment.builder()
				.board(board)
				.writer(writer)
				.content(content)
				.build();
	}

}
