package com.ssooya.domain.member;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "MEMBER")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false) // 널허용 X
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(nullable = true)
	private String name;

	@Column
	private String grade;

	@Column
	private String type;

	@Builder
	public Member(String email, String password, String name , String grade , String type){
		this.email = email;
		this.password = password;
		this.name = name;
		this.grade = grade;
		this.type = type;
	}

}
