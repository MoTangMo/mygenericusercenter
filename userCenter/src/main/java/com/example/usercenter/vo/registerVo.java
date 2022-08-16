package com.example.usercenter.vo;
import lombok.Data;
import lombok.ToString;
import java.io.Serializable;

@Data
@ToString
public class registerVo implements Serializable {

    private String nikeName;

    private String password;

    private String phoneNumber;
}
