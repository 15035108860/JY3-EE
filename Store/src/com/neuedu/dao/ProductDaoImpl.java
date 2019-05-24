package com.neuedu.dao;

import com.neuedu.dataSource.DruidDataSou;
import com.neuedu.pojo.Product;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class ProductDaoImpl implements ProductDao{
    private DruidDataSou dds;
    private QueryRunner qr;
    public ProductDaoImpl(){
        this.dds = DruidDataSou.getDataSource();
        this.qr = new QueryRunner();
    }
    //添加方法
    @Override
    public void addOneProduct(Product product) {

        Connection connection = dds.getConnection();
        String sql = "INSERT INTO product VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            qr.update(connection, sql, product.getPro_id(), product.getPro_name(), product.getPro_price(), product.getPro_img(), product.getPro_desc(), product.getPro_stock(), product.getPro_date(), product.getPro_cate_id(), product.getPro_factory());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
