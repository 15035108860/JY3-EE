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

@WebServlet(name = "ChangePasswordServlet",urlPatterns = "/changePassword.do")
public class ChangePasswordServlet extends HttpServlet {

    private UserDao ud = null;

    @Override
    public void init() throws ServletException {
        ud = new UserDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String oldPsw = request.getParameter("oldPsw");
        String newPsw = request.getParameter("newPsw");
        User user = new User(username,oldPsw);
        Boolean result = ud.changePassword(user, newPsw);
        if (result == true){
            request.setAttribute("username",username);
            request.getRequestDispatcher("changeSuccessful.jsp").forward(request,response);
        }else {

            request.getRequestDispatcher("changeFaile.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
