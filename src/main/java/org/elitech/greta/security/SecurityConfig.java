package org.elitech.greta.security;

import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		super.configure(auth);
	}

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.formLogin().loginPage("/login");
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		//http.authorizeRequests().antMatchers(HttpMethod.GET,"/categories/**").permitAll();
		//http.authorizeRequests().antMatchers(HttpMethod.GET,"/photoProduit/**","/produits/**","/cherchermotCle/**").permitAll();
		//http.authorizeRequests().antMatchers("/categories/**,/produits/**").hasAuthority("ADMIN");
		//http.authorizeRequests().antMatchers("/Panier/**").hasAuthority("USER");
		http.authorizeRequests().antMatchers("/cvs/**").hasAuthority("USER");
		http.authorizeRequests().antMatchers("/ingestion/**").hasAuthority("USER");
		http.authorizeRequests().antMatchers("/langues/**").hasAuthority("ADMIN");
		http.authorizeRequests().antMatchers("/offres/**").hasAuthority("RECRUTEUR");
		http.authorizeRequests().antMatchers("/gesrecruteur/**").hasAuthority("RECRUTEUR");
		http.authorizeRequests().anyRequest().authenticated();
		http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
	}
}
