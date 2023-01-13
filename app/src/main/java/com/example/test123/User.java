package com.example.test123;

import androidx.annotation.NonNull;

public class User {
    private String username;
    private String email;
    private String phone;
    private String password;
    private int discount;

    public User(String username, String email, String phone, String password, int discount) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NonNull
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", discount=" + discount +
                '}';
    }
}
