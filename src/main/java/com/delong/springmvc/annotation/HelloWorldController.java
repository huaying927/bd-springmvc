package com.delong.springmvc.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController
{
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @RequestMapping("/test")
    public void test()
    {
        System.out.println("test method");
    }

//    @RequestMapping("/test2")
    @GetMapping("/test2")
    public ModelAndView test2()
    {
        System.out.println("test2 method");

        return new ModelAndView("helloWorldResult");
    }

    @RequestMapping("/test3")
    public ModelAndView test3()
    {
        System.out.println("test3 method");

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("helloWorldResult");

//        final ModelAndView modelAndView = new ModelAndView("helloWorldResult");

        return modelAndView;
    }

    @RequestMapping("/test4")
    public String test4()
    {
        System.out.println("test4 method");

        return "helloWorldResult";
    }

    @RequestMapping("/test5")
    public String test5()
    {
        System.out.println("测试转发");

        return "forward:test6";
    }
    @RequestMapping("/test6")
    public String test6()
    {
        System.out.println("同一控制器转发成功");

        return "helloWorldResult";
    }

    @RequestMapping("/test5-2")
    public String test5_2()
    {
        System.out.println("测试转发test5-2");

        return "forward:/hello-world/test6-2";
    }

    @RequestMapping("/test6-2")
    public String test6_2()
    {
        System.out.println("同一控制器转发成功test6-2");

        return "helloWorldResult";
    }

    @RequestMapping("/test5-3")
    public String test5_3()
    {
        System.out.println("测试不同控制器转发");

        return "forward:/user/print";
    }

    @RequestMapping("/test7")
    public String test7()
    {
        System.out.println("测试重定向");

        return "redirect:test8";
    }
    @RequestMapping("/test8")
    public String test8()
    {
        System.out.println("同一控制器重定向成功");

        return "helloWorldResult";
    }

    @RequestMapping("/test7-2")
    public String test7_2()
    {
        System.out.println("测试重定向7-2");

        return "redirect:/hello-world/test8-2";
    }
    @RequestMapping("/test8-2")
    public String test8_2()
    {
        System.out.println("同一控制器重定向成功8-2");

        return "helloWorldResult";
    }

    @RequestMapping("/test7-3")
    public String test7_3()
    {
        System.out.println("测试不同控制器重定向");

        return "redirect:/user/print";
    }

    @RequestMapping("/test7-4")
    public String test7_4()
    {
        System.out.println("测试不经过控制器的重定向");

        return "redirect:/index.jsp";
    }
}
