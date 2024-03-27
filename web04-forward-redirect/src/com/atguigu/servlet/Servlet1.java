package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet
public class Servlet1 extends HttpServlet {
    /*
    * 1 重定向是通过HttpServletResponse对象实现
    * 2 响应重定向是在服务端提示下的，客户断的行为
    * 3 客户端的地址栏是变化的 客户端至少发送了两次请求 客户端产生了多次请求
    * 4 请求产生了多次 后端就会有多个request对象 此时请求的参数是不能传递到下一个的
    * 5 目标资源可以是视图资源
    * 6 目标资源不能是WEB-INF资源 因为是客户端的行为
    * 7 目标资源可以是外部资源
    * */

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收用户请求
        System.out.println("servlet1 执行了");

        System.out.println("servlet1 got money："+req.getParameter("money"));

        // 响应重定向 设置响应状态码为302 同时设置location响应头
        resp.sendRedirect("servlet2");
    }
}
