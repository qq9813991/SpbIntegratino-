package com.ayu.spbintegration.shiro;

import java.sql.SQLException;

import java.util.HashSet;
import java.util.Set;

import com.ayu.spbintegration.dao.LoginDao;
import com.ayu.spbintegration.parm.LoginParm;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @company: qishon
 * @author shuqiang.xie
 * @date:2016��12��19�� ����1:33:27
 * @Description:
 */
public class LoginRealm extends AuthorizingRealm {
    @Autowired
    LoginDao loginDao;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        // SecurityUtils.getSubject().getSession().setTimeout(30000);
        String    loginName = (String) token.getPrincipal();
        String    pwd       = new String((char[]) token.getCredentials());
        LoginParm loginParm = new LoginParm();

        loginParm.setLoginName(loginName);
        loginParm.setPwd(pwd);

        try {
            if (this.loginDao.checkLogin(loginParm) != null) {
                return new SimpleAuthenticationInfo(token.getPrincipal(), token.getCredentials(), this.getName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Set<String>             role              = new HashSet<String>();
        LoginParm               loginParm         = new LoginParm();

        loginParm.setLoginName((String) principals.getPrimaryPrincipal());
        role.add(this.loginDao.getRole(loginParm));
        authorizationInfo.setRoles(role);

        return authorizationInfo;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
