package com.ssooya.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// DB Layer 접근자
// <Entity Class, PK타입> 상속
// Entity클래스와 EntityRepository는 함께 위치..
public interface MemberRepository extends JpaRepository<Member, Long> {

	Optional<Member> findByEmail(String email);



}
