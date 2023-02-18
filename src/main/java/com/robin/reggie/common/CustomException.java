package com.robin.reggie.common;

/**
 * 自定义业务异常类
 * @Auther: RobinWu
 * @Date: 2023/2/16 18:17
 * @Description:
 **/
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
