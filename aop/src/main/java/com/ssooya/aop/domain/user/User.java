package com.ssooya.aop.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class User {


	@Id
	@GeneratedValue
	private long idx;

	@Column
	private String email;

	@Column
	private String name;

	@Builder
	public User(String email, String name) {
		this.email = email;
		this.name = name;
	}

}
