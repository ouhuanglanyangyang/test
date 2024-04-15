package com.yll.online_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/* Swagger配置类 */
@Configuration  //java配置类的注解：标识该类是一个配置类
@EnableOpenApi  //开启生成接口文档，只有开启了OpenAi,才能实现生成接口文档的功能
public class SwaggerConfig {
    @Bean
    public Docket adminApi() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("Admin API")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yll.online_project.controller.admin"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket studentApi() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("Student API")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yll.online_project.controller.student"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket teacherApi() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("Teacher API")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yll.online_project.controller.teacher"))
                .paths(PathSelectors.any())
                .build();
    }
//    @Bean
//    public Docket docket() {
//        return new Docket(DocumentationType.OAS_30)  //DocumentationType.OAS_30固定的，代表swagger3
//                .apiInfo(apiInfo()).enable(true)  //生成API信息
//                .select()  //返回一个ApiSelectorBuilder实例，用来控制接口被swagger做成文档
//                .apis(RequestHandlerSelectors.basePackage("com.yll.online_project.controller"))  //指定扫描哪个包下的接口
//                .paths(PathSelectors.any())  // 指定路径处理，PathSelectors.any()代表不过滤任何路径
//                .build();
//    }

    //定义API主界面信息，可申明所有的API总标题、描述、版本
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("在线考试系统")  //自定义API主标题
                .description("Spring Boot 集成 Swagger3 测试接口文档")  //描述整体的API
                .termsOfServiceUrl("")  //定义服务的域名
                .version("1.8")  //定义版本
                .build();
    }
}
