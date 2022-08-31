package com.example.javadesignpatterns.strategy.firstwrite;

import lombok.Data;

/**
 * @author zoh66
 * @Description
 * @create 2022-08-31 9:04 AM
 */

@Data
public class LoginRequest {

    private String userId;

    private LoginType loginType;
}
