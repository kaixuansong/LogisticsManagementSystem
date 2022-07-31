package com.zhao.mapper;

import com.zhao.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    /**
     * 简单sql,根据邮箱查询所有用户信息
     * @param email 用户邮箱
     * @return 可能为空，必要时放回User可为Object
     */

    @Select("select * from user where email = #{email} and password = #{password}")
    User getUserByEmail(@Param("email") String email,@Param("password") String password);


}
