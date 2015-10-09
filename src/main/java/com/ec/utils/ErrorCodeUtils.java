package com.ec.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

/**
 * User: chaocui200783
 * Date: 14-10-29
 * Time: 下午3:34
 */
@Configuration
@PropertySource("classpath:error-code.properties")
public class ErrorCodeUtils {

    private static Environment env;
    @Autowired
    private Environment environment;

    @PostConstruct
    public void init() {
        this.env = environment;
    }

    public static String getErrorMsg(int errorCode){
        return env.getProperty(String.valueOf(errorCode));
    }
}
