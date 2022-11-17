package com.example.ventasOtmV2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
//@PropertySource("classpath:config.properties")
public class CorsClass implements WebMvcConfigurer {


    @Autowired
    private Environment environment;


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        String origins = environment.getProperty("origins");
        registry.addMapping("/**")
                .allowedOrigins("*");
    }

}
