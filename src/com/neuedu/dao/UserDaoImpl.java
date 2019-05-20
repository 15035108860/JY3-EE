package com.neuedu.dao;
import com.neuedu.entry.User;
import com.neuedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{

    @Override
    public void register(String username, String password) {
        Connection conn = DBUtils.getConnection();;
        PreparedStatement ps = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "INSERT INTO user(username,password) VALUES(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
          DBUtils.closePreparedStatement(ps);
          DBUtils.closeConnection(conn);
        }
    }

    //修改密码
    @Override
    public Boolean changePassword(User user, String newPsw) {
        Connection conn = DBUtils.getConnection();
        String sql = "UPDATE user SET password = ? WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,newPsw);
            ps.setString(2,user.getUsername());
            ps.setString(3,user.getPassword());
            int i = ps.executeUpdate();
            if (0 == i){
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

}
