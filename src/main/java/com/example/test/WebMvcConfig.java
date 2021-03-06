// package com.example.test;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import com.example.test.interceptor.AuthenticationInterceptor;
//
//@Configuration
//@EnableWebMvc
//public class WebMvcConfig implements WebMvcConfigurer {
//	// interceptor bean 처리
//	@Bean
//	public AuthenticationInterceptor authenticationInterceptor() {
//		return new AuthenticationInterceptor();
//	}
//	
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authenticationInterceptor())
//				.addPathPatterns("/user/**")
//                .excludePathPatterns("/user/login", "/user");
//    }
//    
//    @Override	
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html")
//            .addResourceLocations("classpath:/META-INF/resources/");
//
//        registry.addResourceHandler("/webjars/**")
//            .addResourceLocations("classpath:/META-INF/resources/webjars/");
//        
//        registry.addResourceHandler("/webjars/**")
//        .addResourceLocations("classpath:/WEB-INF/view/");
//    }
//}