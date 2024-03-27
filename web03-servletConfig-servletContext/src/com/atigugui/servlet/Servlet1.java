package com.atigugui.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

public class Servlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("--------------ServletConfig获取参数---------------");
        ServletConfig servletConfig = getServletConfig();
        // 获取初始配置信息即可
        // 根据参数名获取参数值
        String keya = servletConfig.getInitParameter("keya");
        System.out.println("keya:" + keya);

        //获取所有的初始化参数的名字
        // hasMoreElements 判断有没有下一个参数 如果有返回true 如果没有返回false
        // nextElement 1取出下一个元素 2向下移动游标
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();

        while (initParameterNames.hasMoreElements()) {
            String pname = initParameterNames.nextElement();
            System.out.println(pname+"="+getInitParameter(pname));
        }
        System.out.println("--------------ServletContext获取参数---------------");
        // 获取ServletContext
        ServletContext servletContext = servletConfig.getServletContext();
        ServletContext servletContext1 = req.getServletContext();
        ServletContext servletContext2 = getServletContext();
        System.out.println(servletContext1 == servletContext2);
        System.out.println(servletContext2 == servletContext);

        String encoding = servletContext.getInitParameter("encoding");
        System.out.println("encoding" + encoding);

        Enumeration<String> parameterNames = servletContext.getInitParameterNames();
        while (parameterNames.hasMoreElements()){
            String pname = parameterNames.nextElement();
            System.out.println(pname + "=" + servletContext.getInitParameter(pname));
        }
    }
}
