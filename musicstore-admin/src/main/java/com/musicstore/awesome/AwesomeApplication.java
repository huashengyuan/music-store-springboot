package com.musicstore.awesome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.musicstore.awesome.dao")
@EnableTransactionManagement
public class AwesomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwesomeApplication.class, args);
    }

}
