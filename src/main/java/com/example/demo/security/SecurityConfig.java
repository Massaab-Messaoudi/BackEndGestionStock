package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	/**
	 * int this method we will give the authirizations for roles
	 *   Roles -> Acces
	 */
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.httpBasic().and().authorizeRequests().antMatchers("/api/**").hasRole("USER")
		.antMatchers("/**").hasRole("ADMIN")
		.and().csrf().disable().headers().frameOptions().disable();
	}
	/**
	 * in this method we will specify for each user his role 
	 * User -> Roles
	 * @throws Exception 
	 */
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.inMemoryAuthentication().passwordEncoder(
				NoOpPasswordEncoder.getInstance())
		.withUser("root").password("root").roles("USER")
		.and().withUser("admin").password("admin").roles("ADMIN","USER");
	}

}
