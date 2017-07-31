package com.xpd.web.psc.spring.config;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(MvcConfig.class);
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	LOGGER.debug("MvcConfig::addResourceHandlers)");
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
    
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		LOGGER.debug("MvcConfig::configureDefaultServletHandling");
		configurer.enable();
	}
	
    @Bean
    public TilesConfigurer tilesConfigurer(){
    	LOGGER.debug("MvcConfig::tilesConfigurer");
    	TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[] {
        		"/WEB-INF/views/tiles.xml",
        		"/WEB-INF/views/**/tiles.xml"
        		});
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
    }
    
    @Bean
    public UrlBasedViewResolver viewResolver() {
    	LOGGER.debug("MvcConfig::viewResolver");
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setViewClass(TilesView.class);
        return viewResolver;
    }
	
    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageSource() {
    	LOGGER.debug("MvcConfig::getMessageSource");
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("classpath:messages");
        resource.setDefaultEncoding("ISO-8859-1");
        return resource;
    }
    
    @Bean
    public LocaleResolver localeResolver() {
    	LOGGER.debug("MvcConfig::localeResolver");
        CookieLocaleResolver localeResolver = new CookieLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("es"));
        return localeResolver;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
    	LOGGER.debug("MvcConfig::localeChangeInterceptor");
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        return localeChangeInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	LOGGER.debug("MvcConfig::addInterceptors");
        registry.addInterceptor(localeChangeInterceptor());
    }
}