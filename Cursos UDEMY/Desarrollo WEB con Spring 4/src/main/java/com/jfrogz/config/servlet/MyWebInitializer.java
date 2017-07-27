package com.jfrogz.config.servlet;

import com.jfrogz.config.spring.SpringConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                SpringConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
