package com.neuedu.Servlet;

import com.neuedu.dao.UserDao;
import com.neuedu.dao.UserDaoImpl;
import com.neuedu.entry.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GetAllUserServlet",urlPatterns = "/alu.do")
public class GetAllUserServlet extends HttpServlet {
    //初始化UserDao对象
    private UserDao ud;
    //初始化方法
    @Override
    public void init() throws ServletException {
        ud = new UserDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> allusers = ud.getAllusers();
        List<String> names = new ArrayList<>();
        List<String> psws = new ArrayList<>();

        for (int i = 0; i < allusers.size(); i++){
            names.add(allusers.get(i).getUsername());
            psws.add(allusers.get(i).getPassword());
        }
        request.setAttribute("users",names);
        request.setAttribute("password",psws);
        request.getRequestDispatcher("getAllUser.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
