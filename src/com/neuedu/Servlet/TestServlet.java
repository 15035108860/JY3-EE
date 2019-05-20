package com.neuedu.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestServlet",urlPatterns = {"/test.do","/test1.do"})
public class TestServlet extends HttpServlet {

    public TestServlet(){
        System.out.println("我是构造器");
    }

//    @Override
//    public void init() throws ServletException {
//        System.out.println("我是init");
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        System.out.println("我是doPost");
//
//    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //返回请求资源所属的web项目的路径（即输出项目名）
        String contextPath = req.getContextPath();
        System.out.println("fds"+contextPath);
        //获取提交方式
        String method = req.getMethod();
        System.out.println(method);
        //返回请求行中的资源名部分（做权限检验）
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        //返回请求的参数部分
        String queryString = req.getQueryString();
        System.out.println(queryString);
        //返回请求行中的协议名和版本
        String protocol = req.getProtocol();
        System.out.println(protocol);
        //拿到servlet的名称和路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath);

        //getRemoteUseer()远程用户
        String remoteUser = req.getRemoteUser();
        System.out.println(remoteUser);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("我是doGet");
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
