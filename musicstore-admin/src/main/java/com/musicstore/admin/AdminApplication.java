package com.musicstore.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
<<<<<<< HEAD:musicstore-admin/src/main/java/com/musicstore/awesome/AwesomeApplication.java
@MapperScan("com.musicstore.awesome.dao")
@EnableTransactionManagement
public class AwesomeApplication {
=======
public class AdminApplication {
>>>>>>> init projects:musicstore-admin/src/main/java/com/musicstore/admin/AdminApplication.java

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
