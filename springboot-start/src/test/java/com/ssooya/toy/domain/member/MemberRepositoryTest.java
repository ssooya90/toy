package com.ssooya.toy.domain.member;

// Member Entity Test Class

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

	@Autowired
	MemberRepository memberRepository;


	@After // 단위 테스트가 끝날 때마다 수행되는 메소드를 지정,
	public void cleanup() {
		memberRepository.deleteAll();
	}

	@Test
	public void 멤버_불러오기(){

		//given
		String userId = "ssooya90";
		String password = "1234";
		String userName = "1234";
		String userType = "1234";
		String userAge = "1234";

		memberRepository.save(Member.builder()
				.userId(userId)
				.password(password)
				.userName(userName)
				.userType(userType)
				.userAge(userAge)
				.build());


		//when
		List<Member> memberList = memberRepository.findAll();

		//then
		Member member = memberList.get(0);
		assertThat(member.getUserId()).isEqualTo(userId);
		assertThat(member.getPassword()).isEqualTo(password);
		assertThat(member.getPassword()).isEqualTo(userName);
		assertThat(member.getPassword()).isEqualTo(userType);
		assertThat(member.getPassword()).isEqualTo(userAge);
	}
}
