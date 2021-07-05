package com.delong.springmvc.traditional;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet的生命周期：
 * 1.加载
 * 2.实例化
 * 3.初始化(init method)
 * 4.执行service方法
 * 5.销毁(destroy)
 */
@WebServlet("/myServlet")
public class MyServlet extends HttpServlet
{
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println("request.getMethod() = " + request.getMethod());
        System.out.println("service method is executed");
    }
}
