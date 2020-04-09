package com.ssooya.toy.domain.board;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ssooya90@naver.com on 2020-04-07
 * Github : http://github.com/ssooya90
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardListTest {


	@Autowired
	BoardRepository boardRepository;



	@Test
	public void 게시글_리스트_불러오기(){

		//when
		List<Board> boardList = boardRepository.findAllDesc();

		//then

	}


	@Test
	public void 게시글_불러오기(){

		//given
		String title = "테스트 게시글";
		String contents = "테스트 본문";
		String writer = "테스트 작성자";

		boardRepository.save(Board.builder()
		.title(title)
		.contents(contents)
		.writer(writer)
		.build());

		//when
		List<Board> boardList = boardRepository.findAll();

		Board board = boardList.get(boardList.size()-1);
		assertThat(board.getTitle()).isEqualTo(title);
		assertThat(board.getContents()).isEqualTo(contents);

		// then




	}

}



