package com.jiangjg.springstudy.hibernate.entities;

/**
 * Created by root on 16-4-10.
 */
public class Account {
    private Integer id;
    private String userName;
    private int balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
