package com.joycheng.ryan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.joycheng.ryan.mapper")
@SpringBootApplication
public class RyanApplication {

    public static void main(String[] args) {
        SpringApplication.run(RyanApplication.class, args);
        //主方法
    }

}
