package com.passionke.youtube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by passionke on 16/1/3.
 * wanliang@wacai.com
 */
@EnableAutoConfiguration
@EnableConfigurationProperties
@SpringBootApplication
@ImportResource("classpath*:/spring/**/*.xml")
public class SpringBootMain {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootMain.class, args);
    }
}
