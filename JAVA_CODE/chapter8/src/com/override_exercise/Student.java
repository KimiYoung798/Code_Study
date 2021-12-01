package com.override_exercise;
/*
* 2) 编写一个 Student 类，继承 Person 类，增加 id、score 属性/private，以及构造器，定义 say 方法(返回自我介绍的信息)。
* */
public class Student extends Person {
    private String id;
    private int score;


    public Student() {}

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
        //this.id.equals(id);
    }

    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + "我的id是" + id + "\n我的成绩是" + score;
    }

}
