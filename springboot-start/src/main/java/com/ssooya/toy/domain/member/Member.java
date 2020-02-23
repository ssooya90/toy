package com.ssooya.toy.domain.member;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by ssooya90@naver.com on 2020-02-21
 * Github : http://github.com/ssooya90
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;

	@Column(nullable = false) // 널허용 X
	private String userId;

	@Column(nullable = false)
	private String password;

	@Column(nullable = true)
	private String userName;

	@Column
	private String userType;

}
