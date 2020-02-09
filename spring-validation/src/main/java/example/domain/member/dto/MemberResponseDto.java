package example.domain.member.dto;

import example.domain.member.Member;
import lombok.Data;

@Data
public class MemberResponseDto {

	private Long id;
	private String name;
	private String phoneNumber;
	private String email;


	public MemberResponseDto(Member member){
		id = member.getId();
		name = member.getName();
		phoneNumber = toStringPhone(member.getPhone1(),member.getPhone2(),member.getPhone3());
		email = member.getEmail();
	}

	private String toStringPhone(String phone1, String phone2, String phone3){
		return phone1 + "-" + phone2 + "-" + phone3;
	}

}
