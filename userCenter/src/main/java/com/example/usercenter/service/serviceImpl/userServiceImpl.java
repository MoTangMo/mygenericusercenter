package com.example.usercenter.service.serviceImpl;

import com.example.usercenter.entity.CenterUserEntity;
import com.example.usercenter.exceptionHandler.myException;
import com.example.usercenter.repository.userRepository;
import com.example.usercenter.resultData.R;
import com.example.usercenter.service.userService;
import com.example.usercenter.utils.passwordUtil;
import com.example.usercenter.vo.loginVo;
import com.example.usercenter.vo.registerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userRepository;

    /**
     *
     * user register
     *
     * */
    @Override
    public CenterUserEntity saveUser(registerVo userEntity) {
        long existPhonenumber = userRepository.countByPhonenumber(userEntity.getPhoneNumber());
        if (existPhonenumber > 0) {
            throw new myException(String.valueOf(R.ERROR_EXISTUSER));
        }else {
            CenterUserEntity entity = new CenterUserEntity();
            String salt = passwordUtil.getSalt();
            String EncryPassword = passwordUtil.SaltToPass(salt, userEntity.getPassword());
            entity.setUserpassword(passwordUtil.passToEncry(EncryPassword));
            entity.setSalt(salt);
            entity.setNickname(userEntity.getNikeName());
            entity.setPhonenumber(userEntity.getPhoneNumber());
            return userRepository.save(entity);
        }
    }


    /**
     *
     * user login
     *
     * */
    @Override
    public CenterUserEntity userLogin(loginVo loginVo) {
        CenterUserEntity existUser = userRepository.getByPhonenumber(loginVo.getPhoneNumber());
        if (existUser == null){throw new myException(R.ERROR_USERNOTEXIST);}
        String inputPass = passwordUtil.SaltToPass(existUser.getSalt(), loginVo.getPassword());
        String passToEncry = passwordUtil.passToEncry(inputPass);
        if (passToEncry.equals(passToEncry)){ return existUser;}
        else {throw new myException(R.ERROR_PASSWORDERROR);}
    }
}
