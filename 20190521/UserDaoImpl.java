package com.neuedu.dao;
import com.neuedu.entry.User;
import com.neuedu.utils.DBUtils;
import sun.security.pkcs11.Secmod;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    //得到所有的用户
    @Override
    public List<User> getAllusers() {
        List<User> users = new ArrayList<>();
        Connection conn = DBUtils.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "SELECT username,password FROM user";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                String username = rs.getString("username");
                String password = rs.getString("password");
                User user = new User(username,password);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResultSet(rs);
            DBUtils.closePreparedStatement(ps);
            DBUtils.closeConnection(conn);
        }
        return users;
    }

}
