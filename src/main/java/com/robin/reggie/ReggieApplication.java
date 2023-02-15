package com.robin.reggie;

import com.robin.reggie.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


@Slf4j
@ServletComponentScan
@SpringBootApplication
public class ReggieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
        log.info("项目启动成功....");
    }
}
