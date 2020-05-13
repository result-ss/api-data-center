package com.ss.api.data.center;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.ss.api.data.center.dal.mapper")
@EnableCaching
@EnableDubbo(scanBasePackages = "com.ss.api.data.center.service")
public class  Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
