package com.delong.springmvc.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController
{
    @RequestMapping("/print")
    public String printUser()
    {
        System.out.println("print user method is executed");

        return "userResult";
    }
}
