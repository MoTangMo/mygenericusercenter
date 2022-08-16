package com.example.usercenter.Controller;

import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTHeader;
import cn.hutool.jwt.JWTUtil;
import com.example.usercenter.entity.CenterUserEntity;
import com.example.usercenter.resultData.Result;
import com.example.usercenter.service.userService;
import com.example.usercenter.vo.loginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;

@RestController
@RequestMapping("/usercenter")
public class loginController {

    @Autowired
    private userService userService;

    @PostMapping("userlogin")
    public Result userLogin(loginVo loginVo){
        CenterUserEntity centerUserEntity = userService.userLogin(loginVo);
        if (centerUserEntity != null) {
            HashMap<String,Object> tokenMap = new HashMap<>();
            tokenMap.put("userId",centerUserEntity.getUserid());
            String token = JWTUtil.createToken(tokenMap,centerUserEntity.getSalt().getBytes(StandardCharsets.UTF_8));
            return Result.ok().data(token);
        }
        return Result.error();
    }


}
