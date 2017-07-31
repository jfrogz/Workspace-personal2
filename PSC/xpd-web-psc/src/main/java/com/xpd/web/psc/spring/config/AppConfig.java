package com.xpd.web.psc.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {
    "com.xpd.web.psc.spring",
    "com.xpd.model",
    "com.xpd.service.impl",
    "com.xpd.persistence"
},
        excludeFilters = {
            @Filter(type = FilterType.ANNOTATION, value = Configuration.class)})
@EnableWebMvc
@Import(value = {
    PersistenceContext.class,
    SecurityConfig.class,
    MvcConfig.class
})
@PropertySource("classpath:config.properties")
public class AppConfig extends AbstractSecurityWebApplicationInitializer {

}
