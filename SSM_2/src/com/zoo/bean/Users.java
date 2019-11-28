package com.zoo.bean;

public class Users {

    private Integer uId;
    private String uName;
    private String uPassword;
    private String uIdentity;
    private Integer uCode;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuIdentity() {
        return uIdentity;
    }

    public void setuIdentity(String uIdentity) {
        this.uIdentity = uIdentity;
    }

    public Integer getuCode() {
        return uCode;
    }

    public void setuCode(Integer uCode) {
        this.uCode = uCode;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uIdentity='" + uIdentity + '\'' +
                ", uCode=" + uCode +
                '}';
    }
}
