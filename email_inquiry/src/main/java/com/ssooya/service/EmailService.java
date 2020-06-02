package com.ssooya.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Map;

/**
 * Created by ssooya90@naver.com on 2020-05-18
 * Github : http://github.com/ssooya90
 */


@RequiredArgsConstructor
@Service
public class EmailService {

	private final JavaMailSender javaMailSender;

	public String sendMail(Map pMap) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo((String)pMap.get("address"));
		message.setFrom("test@test.com");
		message.setSubject((String)pMap.get("title"));
		message.setText((String)pMap.get("message"));

		try {
			javaMailSender.send(message);
			return "S";

		}catch (Exception e){
			e.printStackTrace();
			return "E";
		}
	}
}