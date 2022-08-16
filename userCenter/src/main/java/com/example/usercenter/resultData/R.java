package com.example.usercenter.resultData;

import lombok.Data;
import lombok.Getter;

@Getter
public enum R {

    SUCCESS(200, "Success"),
    ERROR_EXISTUSER(406,"User already exists"),
    ERROR_PASSWORDERROR(408,"Password is error , please input again!"),

    ERROR_USERNOTEXIST(407,"User is not exists,please go to register page !"),
    ERROR_COMMOND(400, "Error");

    private int statucCode;

    private String message;

    R(int statucCode, String message){
        this.statucCode = statucCode;
        this.message = message;
    }

}
