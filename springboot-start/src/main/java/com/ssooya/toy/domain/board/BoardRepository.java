package com.ssooya.toy.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by ssooya90@naver.com on 2020-03-31
 * Github : http://github.com/ssooya90
 */
public interface BoardRepository extends JpaRepository<Board, Long> {

	@Query("select b FROM Board b order by b.id DESC")
	List<Board> findAllDesc();

}
