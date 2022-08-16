package com.example.usercenter.Controller;
import com.example.usercenter.entity.CenterUserEntity;
import com.example.usercenter.resultData.Result;
import com.example.usercenter.service.userService;
import com.example.usercenter.vo.registerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usercenter")
public class registerController {

    @Autowired
    private userService userService;

    /**
     *
     * user register
     *
     * */
    @PostMapping("register")
    public Result register(registerVo userEntity){
        CenterUserEntity centerUserEntity = userService.saveUser(userEntity);
        return Result.ok().data(centerUserEntity);
    }

}
