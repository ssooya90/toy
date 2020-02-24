package com.ssooya.toy.web.dto.member;

import com.ssooya.toy.domain.member.Member;
import lombok.Getter;

/**
 * Created by ssooya90@naver.com on 2020-02-24
 * Github : http://github.com/ssooya90
 */

@Getter
public class MemberResponseDto {

	private Long id;
	private String userId;
	private String password;
	private String userName;

	public MemberResponseDto(Member entity){
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.password = entity.getPassword();
		this.userName = entity.getUserName();
	}
}
