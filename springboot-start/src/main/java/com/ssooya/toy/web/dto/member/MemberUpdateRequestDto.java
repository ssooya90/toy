package com.ssooya.toy.web.dto.member;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberUpdateRequestDto {

	private String userName;
	private String userAge;

	private String userState;

	@Builder
	public MemberUpdateRequestDto(String userName, String userAge, String userState){
		this.userName = userName;
		this.userAge = userAge;
		this.userState = userState;
	}
}
