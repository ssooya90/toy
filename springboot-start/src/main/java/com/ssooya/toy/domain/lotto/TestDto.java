package com.ssooya.toy.domain.lotto;

import lombok.Builder;

import java.util.List;

/**
 * Created by ssooya90@naver.com on 2020-04-27
 * Github : http://github.com/ssooya90
 */
public class TestDto {

	private String name;
	private List<TestDto> list;

	@Builder
	public TestDto(List<TestDto> list){
		this.list = list;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setList(List<TestDto> list) {
		this.list = list;
	}

	public List<TestDto> getList() {
		return this.list;
	}
}
