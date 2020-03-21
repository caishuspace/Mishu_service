package edu.upc.mishuserver.init;

import java.security.SecureRandom;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * InitRandom
 */
@Component
@Order(1)
public class InitRandom implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //调用下随机数防止第一次访问卡很久
        new SecureRandom();
    }
}