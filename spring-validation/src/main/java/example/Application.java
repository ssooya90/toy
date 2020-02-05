package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@SpringBootApplication
public class Application {

	@Bean
	public ErrorAttributes errorAttributes() {
		return new DefaultErrorAttributes() {

			@Override
			public Map<String, Object> getErrorAttributes(
					RequestAttributes requestAttributes, boolean includesStackTrace) {
				Map<String, Object> errorAttributes = super.getErrorAttributes((WebRequest) requestAttributes, includesStackTrace);
				Throwable error = getError(requestAttributes);

				if (error instanceof ValidCustomException) {
					errorAttributes.put("error", ((ValidCustomException) error).getErrors());
				}
				return errorAttributes;
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
