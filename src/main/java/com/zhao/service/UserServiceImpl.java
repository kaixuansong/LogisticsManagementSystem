package com.zhao.service;

import com.zhao.mapper.UserMapper;
import com.zhao.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author song
 * @date 2022-3-31
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl( UserMapper userMapper ) {
        this.userMapper = userMapper;
    }

    /**
     *
     * @param email 用户邮箱
     * @param password 用户密码
     * @return
     */
    @Override
    public boolean getUserByEmail( String email , String password ) {
        /*userMapper.getUserByEmail (email);
            判断用户登录是否成功
        */
        User user=userMapper.getUserByEmail(email,password);
        if(user!=null){
            return true;
        }
        return false;
    }

    @Override
    /*
    *   注册
    * */
    public  void addUser(String name, String phone, String password, String email, String sex) {
       userMapper.addUser(name,phone,password,email,sex);


    }
}
