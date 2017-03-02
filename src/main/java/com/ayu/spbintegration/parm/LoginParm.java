package com.ayu.spbintegration.parm;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 *
 * @company: qishon
 * @author shuqiang.xie
 * @date:
 * @Description:
 */
@SuppressWarnings("serial")
@Component
public class LoginParm implements Serializable {

    /**
     * userId-
     */
    private String userId;

    /**
     * loginName-
     */
    private String loginName;

    /**
     * pwd-
     */
    private String pwd;

    /**
     * role-
     */
    private String role;

    /**
     * rememberMe-
     */
    private String rememberMe;

    /**
     * id-
     */
    private String id;

    /**
     * 获取 user id.
     *
     * @return user id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置 user id.
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取 login name.
     *
     * @return login name
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置 login name.
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取 pwd.
     *
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置 pwd.
     *
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取 role.
     *
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置 role.
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取 remember me.
     *
     * @return remember me
     */
    public String getRememberMe() {
        return rememberMe;
    }

    /**
     * 设置 remember me.
     *
     * @param rememberMe
     */
    public void setRememberMe(String rememberMe) {
        this.rememberMe = rememberMe;
    }

    /**
     * 获取 id.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 id.
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
