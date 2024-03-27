package com.atguigu.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servletA")
public class ServletA extends HttpServlet {

    /*
     * 1 请求转发通过HttpServletRequest对象获取请求转发起实现
     * 2 请求转发是服务器内部的行为，对客户断是屏蔽的
     * 3 客户端值发送了一次请求，客户断地址看不变
     * 4 服务端只产生了一对请求和响应对象，这一对请求和响应对象会继续传递给下一个资源
     * 5 因为全程只有一个HttpServletRequset对象,所以请求参数可以传递,请求域中的数据也可以传递
     * 6 请求转发可以转发给其他Servlet动态资源,也可以转发给一些静态资源以实现页面跳转
     * 7 目标资源可以是WEB-INF下的受保护的资源 该方式也是WEB-INF下的资源唯一访问的方式
     * 8 目标资源不可以是外部的资源
     *
     * */

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servletA 执行了");

        String money = req.getParameter("money");
        System.out.println("servletA获得参数：money=" + money);

        // 请求转发给ServletB
        // 获得请求转发器
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("servletB");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/b.html");
        //让请求转发器做出转发动作
        requestDispatcher.forward(req,resp);
    }
}
