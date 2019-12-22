package com.wxwyz.controller;

import com.wxwyz.model.User;
import com.wxwyz.service.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/user/login")
    public String toUserLogin(){
        return "user/userlogin";
    }


    @PostMapping("/user/verify")
    @ResponseBody
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpServletRequest request){

        String result = "-1";
        User user = userServiceImpl.queryOneUser(username);
        if (user != null){
            if (user.getPassword().equals(password)){
                request.getSession().setAttribute("userLogin",user);
                return "1";
            }else {
                return  "0";
            }
        }
        return result;
    }

    @RequestMapping("/user/logout/")
    public String userLogout(HttpServletRequest request){
        request.getSession().removeAttribute("userLogin");
        return "redirect:/";
    }

    @RequestMapping("/user/activate")
    public String toActivate(){
        return "user/activate2";
    }
}
