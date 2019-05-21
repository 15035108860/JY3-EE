package com.neuedu.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ReqServlet",urlPatterns = "/req.do")
public class ReqServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("user","我是请求");
        request.getRequestDispatcher("Req.jsp").forward(request,response);
        //重定向

//        response.setContentType("text/html;charset=utf-8");
//        response.getWriter().write("<p>马上中午了</p>");

    }


}
