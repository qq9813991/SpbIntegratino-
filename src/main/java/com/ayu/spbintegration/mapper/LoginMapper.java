package com.ayu.spbintegration.mapper;

import com.ayu.spbintegration.parm.LoginParm;
import org.springframework.stereotype.Component;


/**
 *
 * @company: qishon
 * @author shuqiang.xie
 * @date:2016��12��20�� ����1:54:14
 * @Description:
 */
@Component
public interface LoginMapper {
    public LoginParm checkLogin(LoginParm loginParm);

    public String getRole(LoginParm loginParm);
}


//~ Formatted by Jindent --- http://www.jindent.com
