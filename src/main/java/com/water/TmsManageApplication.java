package com.water;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@ServletComponentScan
@SpringBootApplication
public class TmsManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsManageApplication.class, args);
    }
}
