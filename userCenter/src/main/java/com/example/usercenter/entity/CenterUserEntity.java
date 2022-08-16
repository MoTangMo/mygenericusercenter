package com.example.usercenter.entity;

import javax.persistence.*;

@Entity
@Table(name = "center_user", schema = "userCenter")
public class CenterUserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userid", nullable = false)
    private long userid;
    @Basic
    @Column(name = "phonenumber", nullable = false, length = 11)
    private String phonenumber;
    @Basic
    @Column(name = "nickname", nullable = false, length = 255)
    private String nickname;
    @Basic
    @Column(name = "userpassword", nullable = true, length = 32)
    private String userpassword;
    @Basic
    @Column(name = "salt", nullable = true, length = 48)
    private String salt;
    @Basic
    @Column(name = "userstatus", nullable = true)
    private Byte userstatus;
    @Basic
    @Column(name = "sex", nullable = true)
    private Byte sex;
    @Basic
    @Column(name = "headimage", nullable = true, length = 60)
    private String headimage;
    @Basic
    @Column(name = "mail", nullable = true, length = 60)
    private String mail;

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Byte getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Byte userstatus) {
        this.userstatus = userstatus;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getHeadimage() {
        return headimage;
    }

    public void setHeadimage(String headimage) {
        this.headimage = headimage;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
