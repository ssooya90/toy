package com.ssooya.web.dto.member;

import com.ssooya.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberSaveRequestDto {

	private String email;
	private String password;
	private String name;
	private String grade;
	private String type;


	@Builder
	public MemberSaveRequestDto(String email, String password, String name, String grade, String type) {

		this.email = email;
		this.password = password;
		this.name = name;
		this.grade = grade;
		this.type = type;
	}

	public Member toEntity() {
		return Member.builder()
				.email(email)
				.password(password)
				.name(name)
				.type(type)
				.build();
	}


}
