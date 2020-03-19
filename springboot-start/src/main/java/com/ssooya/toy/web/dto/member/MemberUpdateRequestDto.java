package com.ssooya.toy.web.dto.member;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberUpdateRequestDto {

	private String userName;
	private String userAge;

	@Builder
	public MemberUpdateRequestDto(String userName, String userAge){
		this.userName = userName;
		this.userAge = userAge;
	}
}
