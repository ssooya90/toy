package com.ssooya.toy.web.dto.board;

import com.ssooya.toy.domain.board.Board;
import lombok.Getter;

/**
 * Created by ssooya90@naver.com on 2020-04-09
 * Github : http://github.com/ssooya90
 */

@Getter
public class BoardResponseDto {

	private Long id;
	private String title;
	private String contents;
	private String writer;

	public BoardResponseDto(Board entity){
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.contents = entity.getContents();
		this.writer = entity.getWriter();
	}


}
