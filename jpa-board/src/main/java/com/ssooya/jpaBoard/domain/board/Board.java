package com.ssooya.jpaBoard.domain.board;

import com.ssooya.jpaBoard.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "board")
public class Board extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "board_id")
	private Long id;

	@Column(length = 10, nullable = false)
	private String writer;

	@Column(length = 100, nullable = false)
	private String title;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;

	@Builder
	public Board(Long id, String writer, String title, String content) {
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
	}
}
