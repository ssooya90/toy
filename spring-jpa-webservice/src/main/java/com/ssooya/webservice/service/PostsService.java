package com.ssooya.webservice.service;

import com.ssooya.webservice.domain.posts.PostRepository;
import com.ssooya.webservice.domain.posts.Posts;
import com.ssooya.webservice.web.dto.PostsResponseDto;
import com.ssooya.webservice.web.dto.PostsSaveRequestDto;
import com.ssooya.webservice.web.dto.PostsUpdateRequestDto;
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

	@Transactional
	public Long update(Long id, PostsUpdateRequestDto requestDto){

		Posts posts = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다 id =" + id));

		posts.update(requestDto.getTitle(), requestDto.getContent());

		return id;
	}

	public PostsResponseDto findById(Long id){
		Posts entity = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
		return new PostsResponseDto(entity);

	}
}