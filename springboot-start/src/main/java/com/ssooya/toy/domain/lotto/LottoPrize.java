package com.ssooya.toy.domain.lotto;

import com.ssooya.toy.domain.BaseTimeEntity;
import lombok.Builder;

import javax.persistence.*;

/**
 * Created by ssooya90@naver.com on 2020-04-16
 * Github : http://github.com/ssooya90
 */
@Entity
@Table(name = "LOTTO_PRIZE")
public class LottoPrize extends BaseTimeEntity {

	@Id
	@GeneratedValue
	private Long Id;

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
	public LottoPrize(int round, int lotto1, int lotto2, int lotto3, int lotto4, int lotto5, int lotto6 ){
		this.round = round;
		this.lotto1 = lotto1;
		this.lotto2 = lotto2;
		this.lotto3 = lotto3;
		this.lotto4 = lotto4;
		this.lotto5 = lotto5;
		this.lotto6 = lotto6;
	}


	/**
	 * 회차별 당첨번호 선정
	 */
}
