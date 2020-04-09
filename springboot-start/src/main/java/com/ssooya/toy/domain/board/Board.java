package com.ssooya.toy.domain.board;

import com.ssooya.toy.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "BOARD")
public class Board extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String writer;

	@Column(nullable = false)
	private String contents;

	@Column
	@ColumnDefault("0")
	private int hit;

	@Builder
	public Board(String title, String writer, String contents){
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}

	public void hitUpdate(Long id){
		this.hit = this.hit + 1;
	}
}
