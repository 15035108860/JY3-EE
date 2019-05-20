package com.neuedu.Servlet;

import com.neuedu.dao.LoginDao;
import com.neuedu.dao.LoginDaoImpl;
import com.neuedu.entry.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet",urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    private LoginDao ld;

    @Override
    public void init() throws ServletException {
        ld = new LoginDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //将用户输入封装成User类
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                User user = new User(username,password);

                //调用登录方法得到结果集
                List<User> users = ld.login();

                //验证用户输入和结果集中数据是否一致
                Boolean result = false;
                for (int i = 0; i < users.size(); i++){
                    if (user.equals(users.get(i))){
                        result = true;
                 }
        }
        //处理验证结果
        if (result == true){
            //跳转页面,请求转发
            request.setAttribute("username",username);
            request.getRequestDispatcher("loginSuccess.jsp").forward(request,response);
        }else {
            response.getWriter().write("<h1>Account password mismatch</h1>");
        }
    }
}
