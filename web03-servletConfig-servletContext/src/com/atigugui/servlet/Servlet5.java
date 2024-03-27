package com.atigugui.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet("/servlet5")
public class Servlet5 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收请求中键值对的参数
        // 根据参数名获取的那个参数值
        String username = req.getParameter("username");
        System.out.println(username);
        String userPwd = req.getParameter("userPwd");
        System.out.println(userPwd);
        // 根据参数名获取多个参数值
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

        //获取所有的参数名
        Enumeration<String> pnames = req.getParameterNames();
        while (pnames.hasMoreElements()) {
            String pname = pnames.nextElement();
            String[] values = req.getParameterValues(pname);
            if (values.length > 1) {
                System.out.println(pname + "=" + Arrays.toString(values));
            }else {
                System.out.println(pname + "=" + values[0]);
            }
        }

        /*
        * 以上api专门用于获取key=value形式的参数，无论这些参数是在url后还是在请求体中
        *
        * 获取请求体中的非键值对自负输入流
        * BufferedReader reader = req.getReader(); JSON串
        * 获得一个从请求中读取二进制数据字节的输入流
        * ServletInputStream inputStream = req.getInputStream(); 文件
        * */

    }
}
