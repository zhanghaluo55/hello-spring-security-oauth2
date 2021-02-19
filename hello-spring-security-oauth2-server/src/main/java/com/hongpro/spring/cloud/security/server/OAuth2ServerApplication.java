package com.hongpro.spring.cloud.security.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2021/1/19 11:04
 */
@SpringBootApplication
@MapperScan(basePackages = "com.hongpro.spring.cloud.security.server.mapper")
public class OAuth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }
}
