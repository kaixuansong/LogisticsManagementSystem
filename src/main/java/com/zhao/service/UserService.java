package com.zhao.service;

/**
 * @author huang
 * @date 2022-7-31
 * @description 用户服务层接口
 */
public interface UserService {
    /**
     * 根据用户邮箱密码判断用户登录是否成功
     * @param email 用户邮箱
     * @param password 用户密码
     * @return 可能为空
     */
    boolean getUserByEmail(String email,String password);


}
