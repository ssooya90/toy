package com.ssooya.toy.domain.member;

		import lombok.*;
		import org.hibernate.annotations.ColumnDefault;

		import javax.persistence.*;

/**
 * Created by ssooya90@naver.com on 2020-02-21
 * Github : http://github.com/ssooya90
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "MEMBER")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false) // 널허용 X
	private String userId;

	@Column(nullable = false)
	private String password;

	@Column(nullable = true)
	private String userName;

	@Column
	private String userType;

	@Column
	private String userState;

	@Column
	private String userAge;

	@Column
	@ColumnDefault("0") //default 0
	private String deposit;

	@Builder
	public Member(String userId, String password, String userName, String userType, String userAge, String deposit){
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.userType = userType;
		this.userAge = userAge;
		this.deposit = deposit;
	}



	public void update(String userName, String userAge){
		this.userName = userName;
		this.userAge = userAge;
	}

	public void delete(String userState){
		this.userState = userState;
	}

}
