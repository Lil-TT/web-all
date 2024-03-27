package com.atigugui.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servlet4")
public class Servlet4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 行相关 GET/POST uri http/1.1
        System.out.println(req.getMethod());// 获取请求方式
        System.out.println(req.getScheme());// 获取请求协议
        System.out.println(req.getProtocol());// 获取请求协议以及版本
        System.out.println(req.getRequestURI());// 获取请求的uri 项目内的额资源路径
        /*
        * uri 统一资源标识符 /demo03/a.html interface 资源定位的要求和规范 动物类
        * url 统一资源定位符 http://ip:port/demo03/a.html class Url implements uri 一个具体的资源路径
        *
        * */
        System.out.println(req.getLocalPort()); // 本应用容器的端口号 8080
        System.out.println(req.getRemotePort());// 客户断软件的端口号

        //头相关 key:value key:value ...
        String accept = req.getHeader("Accept");
        System.out.println(accept);

        //获取本次请求中所有的请求头的名字
        Enumeration<String> headerName = req.getHeaderNames();
        while (headerName.hasMoreElements()) {
            String hname = headerName.nextElement();
            System.out.println(hname+":"+req.getHeader(hname));
        }
    }
}
