package com.gtids.mint;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.security.*;

//@Configuration
//@EnableWebMvc
public class SecurityConfiguration extends WebMvcConfigurerAdapter {

	/*
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 * 
	 * 
	 * 
	 * @Autowired private DataSource dataSource;
	 * 
	 * @Value("${spring.queries.users-query}") private String usersQuery;
	 * 
	 * @Value("${spring.queries.roles-query}") private String rolesQuery;
	 * 
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { auth.jdbcAuthentication().usersByUsernameQuery(usersQuery).
	 * authoritiesByUsernameQuery(rolesQuery)
	 * .dataSource(dataSource).passwordEncoder(bCryptPasswordEncoder); }
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * http.authorizeRequests() // URLs matching for access rights
	 * .antMatchers("/").permitAll() .antMatchers("/login").permitAll()
	 * .antMatchers("/register").permitAll()
	 * .antMatchers("/home/**").hasAnyAuthority("SUPER_USER", "ADMIN_USER",
	 * "SITE_USER") .anyRequest().authenticated() .and() // form login
	 * .csrf().disable().formLogin() .loginPage("/login")
	 * .failureUrl("/login?error=true") .defaultSuccessUrl("/home")
	 * .usernameParameter("email") .passwordParameter("password") .and() // logout
	 * .logout() .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	 * .logoutSuccessUrl("/").and() .exceptionHandling()
	 * .accessDeniedPage("/access-denied"); }
	 * 
	 * @Override public void configure(WebSecurity web) throws Exception {
	 * web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**",
	 * "/js/**", "/images/**"); }
	 */
}
