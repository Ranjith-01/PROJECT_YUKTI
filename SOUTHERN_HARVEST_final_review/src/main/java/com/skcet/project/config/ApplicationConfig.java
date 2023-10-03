package com.skcet.project.config;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration config =  new CorsConfiguration();
		config.addAllowedHeader("*");
		config.addAllowedOrigin("*");
		config.addAllowedMethod("*");
		UrlBasedCorsConfigurationSource source = new  UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return source;
	}
}
