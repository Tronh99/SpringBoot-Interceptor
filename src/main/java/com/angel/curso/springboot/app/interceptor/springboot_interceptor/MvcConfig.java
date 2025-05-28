package com.angel.curso.springboot.app.interceptor.springboot_interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

    @Autowired
    private HandlerInterceptor timInterceptor;

    @Override
    @Qualifier("timeInterceptor")
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timInterceptor);
    }

    

}
