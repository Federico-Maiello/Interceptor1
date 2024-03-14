package com.example.exercise14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class SpringMvc implements WebMvcConfigurer {
    @Autowired
    private LegacyInterceptor legacyInterceptor;
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(legacyInterceptor).addPathPatterns("/legacy");
        registry.addInterceptor(apiLoggingInterceptor).addPathPatterns("/time");
    }
}
