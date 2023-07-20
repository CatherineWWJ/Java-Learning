package com.wwj;

public class User {
    private String userName;
    private String password;
    private String idCard;
    private String phone;

    public User() {
    }

    public User(String userName, String password, String idCard, String phone) {
        this.userName = userName;
        this.password = password;
        this.idCard = idCard;
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
