package org.example.domain;

public class User {
    private int userId;
    private  String name;
    private  String pw;

    public User(int userId, String name, String pw) {
        this.userId = userId;
        this.name = name;
        this.pw = pw;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
