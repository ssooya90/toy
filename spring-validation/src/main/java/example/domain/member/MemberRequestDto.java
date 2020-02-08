package example.domain.member;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class MemberRequestDto {


	/**
	 * Member, MemberRequestDto, MemberResponseDto 3개의 클래스를 생성하였습니다.
	 * 회원 정보를 나타내기 위해 Member클래스만 사용하지 않은 이유는, Entity 클래스를 파라미터 혹은 View 데이터로 사용하게 되면 변화에 대응하기가 힘들기 때문입니다.
	 */

	private Long id;

	@NotBlank(message = "이름을 작성해주세요")
	private String name;

	@NotBlank(message = "전화번호를 작성해주세요")
	@Pattern(regexp = "[0-9]{10,11}", message = "10~11자리의 숫자만 입력가능합니다")
	private String phoneNumber;

	@NotBlank(message = "메일을 적상해주세요")
	@Email(message="메일의 양식을 지켜주세요")
	private String email;

	public MemberRequestDto(){}

	public Member toEntity(){
		String[] phones = parsePhone();
		return new Member(name, phones[0], phones[1], phones[2], email);
	}

	private String[] parsePhone(){
		String[] phones = new String[3];
		int mid = phoneNumber.length() == 10? 7:8;
		phones[0] = phoneNumber.substring(0,3);
		phones[1] = phoneNumber.substring(4,mid);
		phones[0] = phoneNumber.substring(mid,phoneNumber.length()-1);
		return phones;
	}

}
