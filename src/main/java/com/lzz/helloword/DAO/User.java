package com.lzz.helloword.DAO;

public class User {
    private int userid;
    private String username;
    private String tel;

    public User() {
    }

    public User(String username, String realname) {
        this.username = username;
        this.tel = realname;
    }

    public User(int userid, String username, String realname) {
        this.userid = userid;
        this.username = username;
        this.tel = realname;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String Tel) {
        this.tel = tel;
    }
}

