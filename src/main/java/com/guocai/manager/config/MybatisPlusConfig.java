package com.guocai.manager.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * java类简单作用描述
 *
 * @ClassName: MybatisPlusConfig
 * @Package: com.guocai.manager.config
 * @Description:
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-05-29 16:42
 */
@Configuration
@MapperScan("com.guocai.manager.mapper.*")
public class MybatisPlusConfig {
    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
