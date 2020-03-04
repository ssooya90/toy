package com.ssooya.toy.config;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by ssooya90@naver.com on 2020-03-05
 * Github : http://github.com/ssooya90
 */
@Component
public class CsrfInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView mav) throws Exception {
		if ( mav != null){

			// _csrf 찾기
			mav.addObject("_csrf",new Mustache.Lambda(){

				public void execute(Template.Fragment frag, Writer out) throws IOException {

					// token에 해당할 경우
					if("token".equals(frag.execute())){
						//토큰으로 치환
						out.write( ((CsrfToken)(req.getAttribute(CsrfToken.class.getName()))).getToken());
					}
				}
			});
		}

		super.postHandle(req, res, handler, mav);
	}


}
