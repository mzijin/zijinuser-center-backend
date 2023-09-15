package com.zijin.usercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zijin.usercenter.mapper")
public class ZijinuserCenterBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZijinuserCenterBackendApplication.class, args);
    }

}
