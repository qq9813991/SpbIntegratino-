package com.ayu.spbintegration.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

/**
 *
 * @company: qishon
 * @author shuqiang.xie
 * @date:2016��12��19�� ����5:49:39
 * @Description:
 */
public class LoginFormAuthenticationFilter extends FormAuthenticationFilter {
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        return super.onAccessDenied(request, response);
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        final Subject subject = getSubject(request, response);

        if (subject.isAuthenticated() || subject.isRemembered()) {
            return true;
        }

        return false;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
