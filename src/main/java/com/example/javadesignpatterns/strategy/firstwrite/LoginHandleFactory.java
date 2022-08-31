package com.example.javadesignpatterns.strategy.firstwrite;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author zoh66
 * @Description
 * @create 2022-08-31 11:17 AM
 */
@Component
public class LoginHandleFactory implements InitializingBean, ApplicationContextAware {
    private static final Map<LoginType, LoginHandler<Serializable>> LOGIN_HANDLER_MAP = new EnumMap<>(LoginType.class);
    private ApplicationContext context;
    @Override
    public void afterPropertiesSet() throws Exception {
        context.getBeansOfType(LoginHandler.class).values().forEach( loginHandler -> LOGIN_HANDLER_MAP.put(loginHandler.getLoginType(),loginHandler));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public LoginHandler<Serializable> getHandler(LoginType loginType) {
        return LOGIN_HANDLER_MAP.get(loginType);
    }
}
