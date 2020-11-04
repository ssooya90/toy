package com.ssooya.jpaBoard.domain.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Arrays;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

	List <Comment> findByBoard_id(Long id);

	@Query("SELECT c FROM Comment c ORDER BY c.id DESC")
	List <Comment> findByIdAllDesc(Long id);
}
