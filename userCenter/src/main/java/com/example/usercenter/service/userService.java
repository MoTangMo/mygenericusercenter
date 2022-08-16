package com.example.usercenter.service;

import com.example.usercenter.entity.CenterUserEntity;
import com.example.usercenter.vo.loginVo;
import com.example.usercenter.vo.registerVo;

public interface userService {
    CenterUserEntity saveUser(registerVo userEntity);

    CenterUserEntity userLogin(loginVo loginVo);
}
