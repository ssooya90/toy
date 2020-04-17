package com.ssooya.toy.domain.lotto;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// DB Layer 접근자
// <Entity Class, PK타입> 상속
public interface LottoRepository extends JpaRepository<Lotto, Long> {

//	Optional<Lotto> findById(String id);



}
