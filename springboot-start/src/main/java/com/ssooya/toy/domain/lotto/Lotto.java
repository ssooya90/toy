package com.ssooya.toy.domain.lotto;

import com.ssooya.toy.domain.BaseTimeEntity;
import com.ssooya.toy.domain.member.Member;
import lombok.Builder;

import javax.persistence.*;

/**
 * Created by ssooya90@naver.com on 2020-04-14
 * Github : http://github.com/ssooya90
 */

@Entity
@Table(name = "LOTTO")
public class Lotto extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@ManyToOne
	@JoinColumn(name = "member_id" , referencedColumnName = "id")
	private Member member;

	@Column(nullable = false)
	private int round;

	@Column(nullable = false)
	private int lotto1;

	@Column(nullable = false)
	private int lotto2;

	@Column(nullable = false)
	private int lotto3;

	@Column(nullable = false)
	private int lotto4;

	@Column(nullable = false)
	private int lotto5;

	@Column(nullable = false)
	private int lotto6;


	@Builder
	public Lotto(Member member, int round, int lotto1, int lotto2, int lotto3, int lotto4, int lotto5, int lotto6){
		this.member = member;
		this.round = round;
		this.lotto1 = lotto1;
		this.lotto2 = lotto2;
		this.lotto3 = lotto3;
		this.lotto4 = lotto4;
		this.lotto5 = lotto5;
		this.lotto6 = lotto6;
	}

	@Builder
	public Lotto(int lotto1, int lotto2, int lotto3, int lotto4, int lotto5, int lotto6){
		this.lotto1 = lotto1;
		this.lotto2 = lotto2;
		this.lotto3 = lotto3;
		this.lotto4 = lotto4;
		this.lotto5 = lotto5;
		this.lotto6 = lotto6;
	}




	/**
	 * 당첨 유무를 해당 엔티티에 저장하는게 좋을까? 따로 테이블을 만드는게 좋읗까?
	 * 왜 안되냐
	 */
}
