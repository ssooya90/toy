package com.ssooya.jpaBoard.web.comment.dto;

import com.ssooya.jpaBoard.domain.comment.Comment;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentListResponseDto {

	Long id;
	String writer;
	String content;
	LocalDateTime modifiedDate;

	public CommentListResponseDto(Comment entity){
		this.id = entity.getId();
		this.writer = entity.getWriter();
		this.content = entity.getContent();
//		this.modifiedDate = entity();
	}


}
