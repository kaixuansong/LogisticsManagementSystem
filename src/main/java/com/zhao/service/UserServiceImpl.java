package com.zhao.service;

import com.zhao.mapper.UserMapper;
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

        return false;
    }
}
