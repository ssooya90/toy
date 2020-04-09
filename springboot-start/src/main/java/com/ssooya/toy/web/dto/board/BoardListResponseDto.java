package com.ssooya.toy.web.dto.board;

import com.ssooya.toy.domain.board.Board;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Created by ssooya90@naver.com on 2020-04-06
 * Github : http://github.com/ssooya90
 */
@Getter
public class BoardListResponseDto {

	private Long id;
	private String title;
	private String writer;
	private int hit;
	private LocalDateTime modifedDate;

	public BoardListResponseDto(Board entity){
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.writer = entity.getWriter();
		this.hit = entity.getHit();
		this.modifedDate = entity.getModifiedDate();
	}
}
