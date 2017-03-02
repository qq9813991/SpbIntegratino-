package com.ayu.spbintegration.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import org.springframework.stereotype.Service;


/**
 *
 * @company: qishon
 * @author shuqiang.xie
 * @date:2016��12��19�� ����1:23:53
 * @Description:
 */
@Service
public class LoginService {
    public String loginSubmit(String username, String pwd, String rememberMe) {
        final Subject               subject = SecurityUtils.getSubject();
        final UsernamePasswordToken token   = new UsernamePasswordToken(username, pwd);

        if ("true".equals(rememberMe)) {
            token.setRememberMe(Boolean.valueOf(rememberMe));
        }

        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            return "FAIL";
        }

        return "SUCCESS";
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
