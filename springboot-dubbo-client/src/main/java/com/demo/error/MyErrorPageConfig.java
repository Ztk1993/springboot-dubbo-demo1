package com.demo.error;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class MyErrorPageConfig {

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return (container ->{
			ErrorPage errorPage401 = new ErrorPage(HttpStatus.UNAUTHORIZED,"/error-400");
			ErrorPage errorPage404 = new ErrorPage(HttpStatus.NOT_FOUND,"/error-404");
			ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error-500");
			ErrorPage errorPage504 = new ErrorPage(HttpStatus.GATEWAY_TIMEOUT,"/error-504");
			
			container.addErrorPages(errorPage401,errorPage404,errorPage500,errorPage504);
		});
		
	}
}
