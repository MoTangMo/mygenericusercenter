package com.example.usercenter.utils;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import org.springframework.util.DigestUtils;
import java.nio.charset.StandardCharsets;

public class passwordUtil {

    /**
     *
     * 生成密码言
     *
     * */
    public static String getSalt(){
        return RandomUtil.randomBytes(6).toString();
    }

    /**
     *
     * 密码加言
     *
     * */
    public static String SaltToPass(String salt,String password){
        String preSalt = StrUtil.sub(salt, 2, -3);
        String sufSalt =  StrUtil.sub(salt, 0, 3);
        String newPass = preSalt + password + sufSalt;
        return newPass;
    }

    /**
     *
     *密码加密
     *
     * */
    public static String passToEncry(String newPassword){
        return DigestUtils.md5DigestAsHex(newPassword.getBytes(StandardCharsets.UTF_8)).toString();
    }
}
