package com.example.javadesignpatterns.strategy.firstwrite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author zoh66
 * @Description
 * @create 2022-08-31 11:55 AM
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginHandleFactory loginHandlerFactory;



    public LoginResponse<String, Serializable> login(LoginRequest request) {
        LoginType loginType = request.getLoginType();
        // 根据 loginType 找到对应的登录处理器
        LoginHandler<Serializable> loginHandler =
                loginHandlerFactory.getHandler(loginType);
        // 处理登录
        return loginHandler.handLogin(request);
    }
}
