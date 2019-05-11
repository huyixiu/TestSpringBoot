package com.test.spring.boot.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName:SpringBootLoggerApplication
 * @Description
 * @Author: hyx
 * @Date: 2019-04-12 15:12
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.test.spring.boot.logger.mapper")
public class SpringBootLoggerApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootLoggerApplication.class,args);
    }
}
