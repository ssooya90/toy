package com.ssooya.toy.web.dto.board;

import com.ssooya.toy.domain.board.Board;
import com.ssooya.toy.web.dto.member.MemberSaveRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by ssooya90@naver.com on 2020-03-31
 * Github : http://github.com/ssooya90
 */
@Getter
@NoArgsConstructor
public class BoardSaveRequestDto {

	private String title;
	private String contents;
	private String writer;

	@Builder
	public BoardSaveRequestDto(String title, String contents, String writer){
		this.title = title;
		this.contents = contents;
		this.writer = writer;
	}

	public Board toEntity(){
		return Board.builder()
				.title(title)
				.contents(contents)
				.writer(writer)
				.build();
	}


}
