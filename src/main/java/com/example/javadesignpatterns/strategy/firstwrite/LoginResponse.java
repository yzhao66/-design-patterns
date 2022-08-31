package com.example.javadesignpatterns.strategy.firstwrite;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zoh66
 * @Description
 * @create 2022-08-31 9:28 AM
 */
@Data
public class LoginResponse<T, T1 extends Serializable> implements Serializable{


    private String message;

    private T t;

    public LoginResponse( String msg,T t) {
    }


    public static <T> LoginResponse<T, Serializable> success(String msg, T t) {
        return new LoginResponse<>(msg, t);
    }

}
