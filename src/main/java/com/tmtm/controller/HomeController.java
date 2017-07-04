package com.tmtm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 基本控制器
 */
@Controller
public class HomeController {
    @RequestMapping(value="/",method= RequestMethod.GET)
    public String home(){
        return "home"; //返回视图名为home
    }

}
