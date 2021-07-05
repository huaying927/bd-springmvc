package com.delong.springmvc.traditional;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller
{

    @Override
    public ModelAndView handleRequest (HttpServletRequest request,
                                       HttpServletResponse response) throws Exception
    {
        System.out.println("hello controller");

        return new ModelAndView("helloResult");
    }
}
