package com.neuedu.dao;

import com.neuedu.entry.User;

public interface UserDao {
     //注册
     void register(String username,String password);
     //修改密码
     Boolean changePassword(User user, String newPsw);
}
