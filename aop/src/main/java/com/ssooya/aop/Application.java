package com.ssooya.aop;

import com.ssooya.aop.domain.board.Board;
import com.ssooya.aop.domain.board.BoardRepository;
import com.ssooya.aop.domain.user.User;
import com.ssooya.aop.domain.user.UserRepository;
import com.ssooya.aop.service.BoardService;
import com.ssooya.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Application implements CommandLineRunner {

	@Autowired
	private BoardService boardService;

	@Autowired
	private BoardRepository boardRepository;

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		for(int i=1;i<=100;i++){
			boardRepository.save(new Board(i+"번째 게시글의 제목", i+"번째 게시글의 내용"));
			userRepository.save(new User(i+"@email.com", i+"번째 사용자"));
		}
	}

	@GetMapping("/boards")
	public List<Board> getBoards() {
		return boardService.getBoards();
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
