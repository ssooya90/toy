package com.ssooya.jpaBoard.domain.comment;

import com.ssooya.jpaBoard.domain.board.Board;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="comment")
public class Comment {

	@Id
	@GeneratedValue
	@Column
	private Long id;
	private String content;

	private String writer;

	@ManyToOne
	@JoinColumn(name = "board_id")
	private Board board;
}
