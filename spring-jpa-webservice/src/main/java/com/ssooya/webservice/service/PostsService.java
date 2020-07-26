package com.ssooya.webservice.service;

import com.ssooya.webservice.domain.posts.PostRepository;
import com.ssooya.webservice.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

	private final PostRepository postRepository;

	@Transactional
	public Long save(PostsSaveRequestDto requestDto){
		return postRepository.save(requestDto.toEntity()).getId();
	}
}
