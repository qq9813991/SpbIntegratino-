package com.ayu.spbintegration.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayu.spbintegration.parm.LoginParm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ayu.spbintegration.service.LoginService;

/**
 *
 * @company: qishon
 * @author shuqiang.xie
 * @date:2016��12��17�� ����10:09:37
 * @Description:
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService LoginService;

    @RequestMapping(value = "index")
    public String index() {
        return "index";
    }

    @RequestMapping(
        value  = "/loginPage",
        method = RequestMethod.GET
    )
    public String loginPage() {
        return "login";
    }

    @RequestMapping(
        value  = "loginSubmit",
        method = {RequestMethod.POST, RequestMethod.GET}
    )
    public String loginSubmit(HttpServletRequest request, HttpServletResponse response, LoginParm loginParm)
            throws IOException {
        if ("SUCCESS".equals(this.LoginService.loginSubmit(loginParm.getLoginName(),
                                                           loginParm.getPwd(),
                                                           loginParm.getRememberMe()))) {
            return "redirect:welcome";
        } else {
            return "redirect:loginPage";
        }
    }

    @RequestMapping(value = "welcome")
    public String welcome() {
        return "welcome";
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
