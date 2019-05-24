package com.neuedu.controller;

import com.neuedu.dao.ProductDao;
import com.neuedu.dao.ProductDaoImpl;
import com.neuedu.pojo.Product;
import com.neuedu.util.FileAction;
import com.neuedu.util.ProductUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "AddServlet",urlPatterns = "/add.do")
@MultipartConfig
public class AddServlet extends HttpServlet {

    private ProductDao pd;

    @Override
    public void init() throws ServletException {
        pd = new ProductDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //pro_id
        String proid = ProductUtil.getProid();
        //pro_name
        String proname = request.getParameter("proname");
        //pro_price
        String proprice = request.getParameter("proprice");
        double price = Double.parseDouble(proprice);
        //拿到图片并且上传到服务器
        Part proimg = request.getPart("proimg");
        String realName = FileAction.uploadFile(proimg);
        //描述
        String prodesc = request.getParameter("prodesc");
        //库存
        String prostock = request.getParameter("prostock");
        Short stock = Short.parseShort(prostock);
        //System.out.println(prostock);
        //上架时间
        String prodate = request.getParameter("prodate");
        Date date = ProductUtil.getStringConverseDate(prodate);
       // System.out.println("******");
        //System.out.println(prodate);
        //分类id
        String procateid = request.getParameter("procateid");
        short cateid = Short.parseShort(procateid);
        //生产厂商
        String profactory = request.getParameter("profactory");

        Product product = new Product(proid,proname,price,realName,prodesc,stock,date,cateid,profactory);
        pd.addOneProduct(product);
        response.sendRedirect("addSuccess.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
