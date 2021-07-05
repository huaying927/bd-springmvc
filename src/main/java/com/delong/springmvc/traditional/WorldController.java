package com.delong.springmvc.traditional;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WorldController extends AbstractController
{

    @Override
    protected ModelAndView handleRequestInternal (HttpServletRequest request,
                                                  HttpServletResponse response) throws Exception
    {
        System.out.println("world controller");

        return new ModelAndView("worldResult");
    }
}
