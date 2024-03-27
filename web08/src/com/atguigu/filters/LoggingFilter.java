package com.atguigu.filters;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * 日志过滤器 记录请求的历史 将日志打印到控制器
 *
 * 1 实现Filter接口
 * 2 重写过滤方法
 * 3 配置过滤器
 *  web.xml
 *  注解
 */
public class LoggingFilter implements Filter {

    /**
     * 过滤请求的和响应的方法
     * 1 请求到达目标资源之前，先经过该方法
     * 2 该方法有能力控制请求是否继续向后到达目标资源 可以在该方法内直接向客户端做响应处理
     * 3 响应之前，还会经过该方法
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*
         * 1 请求到达目标资源之前的功能代码
         *      判断是否登录
         *      校验权限是否满足
         * 2 放行代码
         *
         * 3 响应之前 HttpServletResponse 转换为响应豹纹之前的功能代码
         */

        // 请求到达目标资源之前的代码
        System.out.println("loggingFilter before doFilter invoked");

        // 放行
        filterChain.doFilter(servletRequest,servletResponse);

        // 响应之前的功能代码
        System.out.println("loggingFilter after doFilter invoke");
    }

}
