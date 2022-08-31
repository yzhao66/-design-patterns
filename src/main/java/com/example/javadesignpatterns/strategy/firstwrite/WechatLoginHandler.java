package com.example.javadesignpatterns.strategy.firstwrite;

/**
 * @author zoh66
 * @Description
 * @create 2022-08-31 10:43 AM
 */
public class WechatLoginHandler implements LoginHandler {
    @Override
    public LoginType getLoginType() {
        return LoginType.WECHAT;
    }

    @Override
    public LoginResponse handLogin(LoginRequest loginRequest) {
        String wechatName=getWechatName(loginRequest.getUserId());
        return LoginResponse.success("微信登录成功",wechatName);
    }

    private String getWechatName(String userId){
        return "yzhao66";
    }
}
