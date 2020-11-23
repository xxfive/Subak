package com.example.login;

public class writer {
    String name;
    String content;
    int resId;
    float star;

    public writer(String name, String content, int resId, float star){
        this.name=name;
        this.content=content;
        this.resId=resId;
        this.star=star;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getResId() {
        return resId;
    }

    public float getStar() {
        return star;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setStar(float star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "writer{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", resId=" + resId +
                ", star=" + star +
                '}';
    }
}
