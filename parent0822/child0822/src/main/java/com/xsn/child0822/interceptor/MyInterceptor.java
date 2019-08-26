package com.xsn.child0822.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class MyInterceptor extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
//        registry.addResourceHandler("/**").addResourceLocations("/classpath:/static/");
        HandlerInterceptor inter = new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("preHandle");
                return true;
            }

            @Override
            public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
                System.out.println("postHandle");
            }

            @Override
            public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
                System.out.println("afterCompletion");
            }
        };
        registry.addInterceptor(inter).addPathPatterns("/reader");
//        super.addInterceptors(registry);
    }
}
