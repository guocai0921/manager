package com.guocai.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * java类简单作用描述
 *
 * @ClassName: CorsConfig
 * @Package: com.guocai.manager.config
 * @Description: 解决cors跨域问题
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-06-12 15:36
 */
@Configuration
public class CorsConfig  {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*")
                        .allowedOrigins("*")
                        .allowCredentials(true)
                        .allowedMethods("GET", "POST", "DELETE", "PUT","PATCH")
                        .maxAge(3600);
            }
        };
    }
}
