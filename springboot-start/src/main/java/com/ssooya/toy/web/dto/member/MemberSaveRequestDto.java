package com.ssooya.toy.web.dto.member;

import com.ssooya.toy.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by ssooya90@naver.com on 2020-02-24
 * Github : http://github.com/ssooya90
 */

@Getter
@NoArgsConstructor
public class MemberSaveRequestDto {

	private String userId;
	private String password;
	private String userName;
	private String userType;
	private String userAge;

	@Builder
	public MemberSaveRequestDto(String userId, String password, String userName, String userType, String userAge){
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.userType = userType;
		this.userAge = userAge;
	}

	public Member toEntity(){
		return Member.builder()
				.userId(userId)
				.password(password)
				.userName(userName)
				.userType(userType)
				.userAge(userAge)
				.build();
	}
}
