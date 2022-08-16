package com.example.usercenter.vo;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class loginVo {
    private Integer loginWay;

    private String phoneNumber;

    private String password;

    private String verificationCode;

    private String MailAddress;

}
