package com.example.javadesignpatterns.strategy.firstwrite;

import java.io.Serializable;

/**
 * @author zoh66
 * @Description
 * @create 2022-08-31 8:59 AM
 */
public interface  LoginHandler <T extends Serializable> {

    LoginType getLoginType();

    LoginResponse<String, T> handLogin(LoginRequest loginRequest);

}
