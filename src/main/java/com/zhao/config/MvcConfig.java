package com.zhao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController ("/").setViewName ("index");
        registry.addViewController ("/index.html").setViewName ("index");
        registry.addViewController ("/admin/login").setViewName ("admin/login");
        registry.addViewController ("/test1.html").setViewName ("test1");
        registry.addViewController ("/test2.html").setViewName ("test2");
        registry.addViewController ("/admin/register").setViewName ("/admin/register");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler ("/**")
                .addResourceLocations ("classpath:/static/");
    }
}
