package com.ssooya.jpaBoard.web.comment.dto;

import com.ssooya.jpaBoard.domain.board.Board;
import com.ssooya.jpaBoard.domain.comment.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentSaveRequestDto {

//	private String boardId;
	private String writer;
	private String content;

	@Builder
	public CommentSaveRequestDto(String board_id, String writer, String content){
//		this.boardId = board_id;
		this.writer = writer;
		this.content = content;
	}

	public Comment toEntity(){
		return Comment.builder()
//				.board(boardId)
				.writer(writer)
				.content(content)
				.build();
	}

}
