package com.ssooya.webservice.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // 스프링부트 테스트와 JUnit 사이에 연결자 역할
@WebMvcTest(controllers = HelloController.class) //  Web에 집중할 수 있는 어노테이션, 선언 시 @Controller 사용가능, 그외 사용불가
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void hello_return() throws Exception{

		String hello = "hello";

		mvc.perform(get("/hello")) // MockMvc를 통해 /hello 주소로 Http get 요청.
				.andExpect(status().isOk())	// 결과검증 -> Http Header의 status를 검증 , 200,404,500 등.. (즉 200인지 아닌지 검증)
				.andExpect(content().string(hello));  // 응답 본문의 내용을 검증합니다.


	}

}
