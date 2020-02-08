package example.domain.member;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class MemberRequestDto {

	private Long id;

	@NotBlank(message = "이름을 작성해주세요")
	private String name;

	@NotBlank(message = "전화번호를 작성해주세요")
	@Pattern(regexp = "[0-9]{10,11}", message = "10~11자리리)

}
