package com.ss.api.data.center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.ss.api.data.center.service.api")
@ServletComponentScan
@MapperScan("com.ss.api.data.center.dal.mapper")
@ComponentScan(basePackages = {"com.ss.api.data.center","com.ss.api.data.center.service.api"})
public class  Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
