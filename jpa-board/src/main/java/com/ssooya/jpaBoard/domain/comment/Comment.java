package com.ssooya.jpaBoard.domain.comment;

import com.ssooya.jpaBoard.domain.board.Board;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "comment")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="comment_id")
	private Long id;
	private String content;
	private String writer;

	@ManyToOne
	@JoinColumn(name = "board_id")
	private Board board;

	@Builder
	public Comment(Long id, String writer, String content, Board board){

		this.id = id;
		this.writer = writer;
		this.content = content;
		this.board = board;
	}


}
