package com.zhao.mapper;

import com.zhao.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    /**
     * 简单sql,根据邮箱查询所有用户信息
     * @param email 用户邮箱
     * @return 可能为空，必要时放回User可为Object
     */
    User getUserByEmail(String email);
}
