package com.example.login;

public class Member {
    private int id;
    private String loginId;
    private String loginPasswd;

    public Member(){}

    public Member(int id, String loginId, String loginPasswd) {
        this.id = id;
        this.loginId = loginId;
        this.loginPasswd = loginPasswd;
    }

    public int getId() {
        return id;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", loginId='" + loginId + '\'' +
                ", loginPasswd='" + loginPasswd + '\'' +
                '}';
    }
}
