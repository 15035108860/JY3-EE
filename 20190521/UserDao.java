package com.neuedu.dao;

import com.neuedu.entry.User;

import java.util.List;

public interface UserDao {
     //注册
     void register(String username,String password);
     //修改密码
     Boolean changePassword(User user, String newPsw);
     //查询所有用户和密码
     List<User> getAllusers();
}
