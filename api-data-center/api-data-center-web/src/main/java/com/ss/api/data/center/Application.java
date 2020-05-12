package com.ss.api.data.center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.ss.api.data.center.dal.mapper")
@EnableCaching
public class  Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
