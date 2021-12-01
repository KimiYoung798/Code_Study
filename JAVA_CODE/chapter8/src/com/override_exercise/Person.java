package com.override_exercise;

/*
 * 1) 编写一个 Person 类，包括属性/private（name、age），构造器、方法 say(返回自我介绍的字符串）。
 * */
public class Person {
    private String name;
    private int age;

    //默认构造器
    public Person() {}

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }
    //方法say
    public String say(){
        return "我的名字是" + name + "\n我的年龄是" + age + "\n";
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 120){
            this.age = age;
        } else {
            System.out.println("输入年龄有误，年龄范围 1-120\n默认初始化为0");
            this.age = 0;
        }
    }
    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
