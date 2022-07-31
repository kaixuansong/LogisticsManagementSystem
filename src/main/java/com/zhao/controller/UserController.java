package com.zhao.controller;

import com.zhao.service.UserService;
import com.zhao.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author huang/song
 * @date 2022-7-30
 * @description 生成验证码
 */
@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController( UserService userService ) {
        this.userService = userService;
    }

    /**
     * 管理员登录接口
     */

    @PostMapping("/adminLogin")
    public Object userLogin( @RequestParam("email") String email,
                             @RequestParam("password") String password,
                             @RequestParam("verification") String verification,
                             HttpServletRequest request ){
        /*先判断用户登录的验证码是否正确，验证码储存在session中，key是 RANDOMKEY */

        /*在判断用户登录是否正确*/
        userService.getUserByEmail (email,password);

//        return new Result ();
        return "redirect:/";
    }
}
