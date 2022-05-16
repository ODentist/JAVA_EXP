package com.o_dentist.pojo;

public class exp_stu {
    int stuno;
    String name;
    String sex;
    int score;

    public exp_stu() {
    }

    public exp_stu(int stuno, String name, String sex, int score) {
        this.stuno = stuno;
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public int getStuno() {
        return stuno;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "exp_stu{" +
                "stuno=" + stuno +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }
}
