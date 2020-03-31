package com.ssooya.toy.domain.member;

import com.ssooya.toy.domain.board.Board;
import com.ssooya.toy.domain.board.BoardRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * Created by ssooya90@naver.com on 2020-03-31
 * Github : http://github.com/ssooya90
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class BaseTimeEntity_등록 {

	@After
	public void tearDown() throws Exception{
		boardRepository.deleteAll();
	}

	@Autowired
	BoardRepository boardRepository;

	@Test
	public void BaseTimeEntity_등록(){

		//given
		LocalDateTime now = LocalDateTime.of(2019,6,4,0,0,0);
		boardRepository.save(Board.builder()
				.title("title")
				.contents("contents")
				.writer("쑤야")
				.build());

		//when
		List<Board> boardsList = boardRepository.findAll();

		//then
		Board board = boardsList.get(0);

		System.out.println(">>>>>>>>>>> createDate =" + board.getCreatedDate()+", modifiedDate = "+ board.getModifiedDate());

		assertThat(board.getCreatedDate()).isAfter(now);
		assertThat(board.getCreatedDate()).isAfter(now);


	}








}
