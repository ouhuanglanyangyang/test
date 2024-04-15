package com.yll.online_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@MapperScan("com.yll.online_project.mapper")  //指定实现类的接口所在的包，包下面所有接口在编译后生成相应的实现类
public class OnlineProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineProjectApplication.class, args);
    }

}
