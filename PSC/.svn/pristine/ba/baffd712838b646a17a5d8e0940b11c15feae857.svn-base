package com.xpd.web.psc.spring.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);
	
	@Autowired
	private DataSource dataSource;
	private final String QUERY_FOR_USERS = " select username, password, enabled from users where username = ? ";
	private final String QUERY_FOR_ROLES = " select username, role from user_roles where username = ? ";
	
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
    	LOGGER.debug("configureGlobalSecurity(AuthenticationManagerBuilder auth)");
    	auth.jdbcAuthentication()
    		.usersByUsernameQuery(QUERY_FOR_USERS)
    		.authoritiesByUsernameQuery(QUERY_FOR_ROLES)
    		.dataSource(dataSource);
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	LOGGER.debug("configure(HttpSecurity http)");
    	String loginPage = "/login.jsp";
    	http
    		.authorizeRequests()
    		.antMatchers("/resources/**").permitAll()
	    	.antMatchers(loginPage).permitAll()
	    	.antMatchers("/**").access("isAuthenticated()")
	    	.and().formLogin().loginPage(loginPage)
	    		.usernameParameter("username").passwordParameter("password")
	    		.failureUrl("/login.jsp?error=true")
	            .loginProcessingUrl("/login")
            .and().logout()
            	.logoutUrl("/logout")
            	.clearAuthentication(true)
            	.invalidateHttpSession(true)
            	.logoutSuccessUrl(loginPage)
            	.permitAll()
            ;
    }
    
    @Override
    public void configure(WebSecurity web) throws Exception {
      web.ignoring().antMatchers("/resources/**");
    }
    
}
