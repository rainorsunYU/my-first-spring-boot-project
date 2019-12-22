package com.wxwyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
public class RouterController {

    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/info/index")
    public String infoIndex(){
        return "info/index";
    }

    @RequestMapping("/user/upload")
    public String uploadJob(HttpServletRequest request){
        String token = UUID.randomUUID().toString();
        request.getSession().setAttribute("token",token);
        return "info/add";
    }

    @RequestMapping("/bus/home")
    public String toBusHome(){
        return "busindex";
    }

    @RequestMapping("/user/classify1")
    public String toUserHome1(){
        return "userClassify/classify1";
    }

    @RequestMapping("/user/classify2")
    public String toUserHom2(){
        return "userClassify/classify2";
    }

    @RequestMapping("/user/classify3")
    public String toUserHome3(){
        return "userClassify/classify3";
    }

    @RequestMapping("/user/classify4")
    public String toUserHome4(){
        return "userClassify/classify4";
    }

}
