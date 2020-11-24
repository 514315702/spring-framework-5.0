package org.study.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyFrontWebAppInitializer /*extends AbstractAnnotationConfigDispatcherServletInitializer */{

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
