package com.robin.reggie;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ReggieApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        String fileName="ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }


}
