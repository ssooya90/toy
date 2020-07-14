package com.ssooya.web.dto.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberSaveRequestDto {

	private String email;
	private String pw;
	private String nm;
	private String grade;
	private String type;


	@Builder
	public MemberSaveRequestDto(String email, String pw, String nm, String grade, String type){

		this.email = email;
		this.pw = pw;
		this.nm = nm;
		this.grade = grade;
		this.type = type;
	}


}
