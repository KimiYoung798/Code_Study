package com.set_;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("rose"));

        set.remove("john");
        System.out.println(set);

        //
        set = new HashSet();
        System.out.println(set);
        set.add("lucy");
        set.add("jack");
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println(set);

        //经典面试题
        //分析原码
        set.add(new String("jar"));
        set.add(new String("jar"));
        System.out.println(set);

    }
}

class Dog {
    private String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}