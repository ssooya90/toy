package com.ssooya.toy.web.controller;

import com.ssooya.toy.domain.member.Member;
import com.ssooya.toy.domain.member.MemberRepository;
import com.ssooya.toy.web.dto.member.MemberSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MemberControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private MemberRepository memberRepository;

	@After
	public void tearDown() throws Exception{
		memberRepository.deleteAll();
	}

	@Test
	public void member_등록테스트() throws Exception{

		//given
		String userId = "ssooya90";
		String password = "1234";
		MemberSaveRequestDto requestDto = MemberSaveRequestDto.builder()
				.userId(userId)
				.password(password)
				.build();

		String url = "http://localhost:" + port + "/api/v1/member";

		// when
		ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, requestDto, Long.class);

		// then
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);

		assertThat(responseEntity.getBody()).isGreaterThan(0L);

		List<Member> all = memberRepository.findAll();
		assertThat(all.get(0).getUserId()).isEqualTo(userId);
		assertThat(all.get(0).getPassword()).isEqualTo(password);

	}


}
