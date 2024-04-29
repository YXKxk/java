package com.itheima;

public class Phone {
    private String pinpai;
    private Integer jiage;

    public Phone() {
    }

    public Phone(String pinpai, Integer jiage) {
        this.pinpai = pinpai;
        this.jiage = jiage;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public Integer getJiage() {
        return jiage;
    }

    public void setJiage(Integer jiage) {
        this.jiage = jiage;
    }
}
