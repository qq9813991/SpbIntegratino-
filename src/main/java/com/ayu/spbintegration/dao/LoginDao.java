package com.ayu.spbintegration.dao;

import java.sql.SQLException;

import com.ayu.spbintegration.mapper.LoginMapper;
import com.ayu.spbintegration.parm.LoginParm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @company: qishon
 * @author shuqiang.xie
 * @date:2016��12��19�� ����1:24:11
 * @Description:
 */
@Repository
public class LoginDao {
    @Autowired
    LoginMapper loginMapper;

    public LoginParm checkLogin(LoginParm loginParm) throws SQLException {
        LoginParm result = loginMapper.checkLogin(loginParm);

        return result;
    }

    public String getRole(LoginParm loginParm) {
        String role = loginMapper.getRole(loginParm);

        return role;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
