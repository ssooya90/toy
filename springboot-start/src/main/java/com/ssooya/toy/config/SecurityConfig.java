package com.ssooya.toy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configurable
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired
	UserDetailsService userDetailsService;

	@Autowired
	PasswordEncoder passwordEncoder;

	/* Password Encoder 등록 */
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	/* 인증방식 */
	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
	}

	/* Security 제외 패턴 */
	@Override
	public void configure(WebSecurity webSecurity) throws Exception{
		webSecurity.ignoring().antMatchers("/templates/**");
	}

	/* 시큐어 패턴 등록 */
	// protected -> 모든 패키지에서 사용 가능하지 않도록 함
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
				.csrf().disable() // csrf를 사용하려면 뷰에서 csrf를 가져와야함
				.authorizeRequests()

				// 페이지 권한 설정
				.antMatchers("/admin/**").hasRole("ADMIN")	// 관리자롤을 가진 회원만 접근 가능
				.antMatchers("/**").permitAll() // 모든 경로에 대해서 권한없이 접근 가능

				.and() // 로그인 설정
				.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/")
				.permitAll()

				.and() // 로그아웃 설정
				.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
				.logoutSuccessUrl("/user/logout/result")
				.invalidateHttpSession(true)
				.and()

				// 403 예외처리 핸들링
				.exceptionHandling().accessDeniedPage("/user/denied");

	}

}
