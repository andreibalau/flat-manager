package com.app.flat.manager.security;

import java.util.Arrays;
import java.util.Collections;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * Flat Manager
 * Created by catalin on 2/21/2020
 */
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	private final TokenAuthorizationFilter tokenAuthorizationFilter;
	private final FailedEntryPointHandler failedEntryPointHandler;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors()
				.configurationSource(corsConfigurationSource())
				.and()
				.csrf()
				.disable()
				.authorizeRequests()
				.antMatchers(
						"/api/v1/users/login",
						"/api/v1/users/register",
						"/v2/api-docs",
						"/swagger-ui.html/**",
						"/webjars/**"
				)
				.permitAll()
				.and()
				.requestMatchers()
				.antMatchers("/api/v1/**")
				.and()
				.addFilterBefore(tokenAuthorizationFilter, UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.anyRequest()
				.authenticated()
				.and()
				.exceptionHandling()
				.accessDeniedHandler(failedEntryPointHandler)
				.authenticationEntryPoint(failedEntryPointHandler)
				.and()
				.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Collections.singletonList("*"));
		configuration.setAllowedHeaders(Collections.singletonList("*"));
		configuration.setExposedHeaders(Arrays.asList("Authorization", "Content-Type"));
		configuration.setAllowedMethods(
				Arrays.asList("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
}
