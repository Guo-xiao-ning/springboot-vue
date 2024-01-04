package com.xiaoning.config;

import com.xiaoning.config.interceptor.JwtInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(jwtInterceptor())
//                .addPathPatterns("/**")  // 拦截所有请求，通过判断token是否合法来决定是否需要登录
//                .excludePathPatterns("/user/login", "/user/register", "/**/export", "/**/import", "/file/**", "/9090");
//    }

    @Bean
    public JwtInterceptor jwtInterceptor() {
        return new JwtInterceptor();
    }
}
//{"username":"admin","password":"admin","nickname":"管理员","avatarUrl":null,"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxIiwiZXhwIjoxNjU3OTQ5OTI4fQ.7xd50Ir_Y7V4jT9pEm-USAOSWkyqKSpWlUdAuVIFVIE111"}