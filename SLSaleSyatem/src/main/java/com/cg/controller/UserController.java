package com.cg.controller;

import com.cg.entity.User;
import com.cg.service.UserService;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/login.html")
    public String login(){

        return "login";
    }

    @RequestMapping("/doLogin.html")
    public ModelAndView doLogin(User user) throws Exception {
        logger.debug("doLogin:"+"loginCode:"+user.getLoginCode()+"password:"+user.getPassword());
        User loginUser = userService.getLoginUser(user);
        return new ModelAndView("loginSuccess");
    }


    @RequestMapping("/exit.html")
    public String exit(){
        return "exit";
    }



}
