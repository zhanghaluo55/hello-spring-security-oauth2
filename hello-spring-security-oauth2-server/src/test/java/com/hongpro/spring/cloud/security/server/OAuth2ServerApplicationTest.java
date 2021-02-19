package com.hongpro.spring.cloud.security.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2021/1/19 14:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OAuth2ServerApplicationTest {
    @Test
    public void testPasswordEncoder() {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
