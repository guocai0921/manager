package com.guocai.manager.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * java类简单作用描述
 *
 * @ClassName: SwaggerConfig
 * @Package: com.guocai.manager.swagger
 * @Description:
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-05-29 14:56
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.guocai.manager.web"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Manager Swagger RESTful APIs")
                .description("综合管理 Swagger API 服务")
                .termsOfServiceUrl("http://swagger.io/")
                .contact(new Contact("Sun GuoCai", "127.0.0.1", "15010503631@163.com.cn"))
                .version("1.0")
                .build();

    }
}
