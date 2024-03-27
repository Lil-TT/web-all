import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/*
*
* */

public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // 1 从request 对象中获取请求中的任何信息（username参数）
        String username = request.getParameter("username");
        // 2 处理业务的代码
        String info = "YES";

        if ("atiguigu".equals(username)){
            info = "NO";
        }
        // 3 将要响应的数据放入response
        PrintWriter writer = response.getWriter(); // 该方法返回的是一个响应体中打印自负的打印流
        writer.write(info);
    }
}