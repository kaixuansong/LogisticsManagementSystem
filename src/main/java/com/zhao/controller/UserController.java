package com.zhao.controller;

import com.alibaba.fastjson.JSON;
import com.zhao.service.UserService;
import com.zhao.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author huang/song
 * @date 2022-7-30
 * @description 生成验证码
 */
@RestController
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
        boolean flag=userService.getUserByEmail (email,password);
        if (flag == true) {
            return "redirect:/test1.html";
        }

//        return new Result ();
        return "redirect:/test2.html";
    }
    @PostMapping("/register")
    public Object userRegister(@RequestBody Map<String, String> map) throws JSONException {
       userService.addUser(map.get("name"),map.get("phone"),map.get("password"),map.get("email"),map.get("sex"));
        Result re=new Result();
        re.setCode(200);
        re.setMsg("111");
        re.setData("222");
        return re;






    }
}
