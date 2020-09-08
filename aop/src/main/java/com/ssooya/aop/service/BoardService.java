package com.ssooya.aop.service;

import com.ssooya.aop.domain.board.Board;
import com.ssooya.aop.domain.board.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

	@Autowired
	private BoardRepository repository;

	public List<Board> getBoards() {
		return repository.findAll();
	}

}
