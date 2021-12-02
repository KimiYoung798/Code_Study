package com.homework;
// 定义一个Person类，初始化Person对象数组，有三个person对象，并按照age从大到小排序，使用冒泡
public class Homework01 {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("jack", 29,"java");
        p[1] = new Person("mary", 21,"会计");
        p[2] = new Person("mark", 35,"总监");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }
        p[0].ageSort(p);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }

        new Professor("张三", 39,"professor", 20000).introduce();


    }

}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        setName(name);
        setAge(age);
        setJob(job);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public void ageSort(Person[] p) {
        for (int i = 0; i < p.length - 1; i++){
            for (int j = 0; j < p.length - 1 - i; j++) {
                if(p[j].age < p[j + 1].age) {
                    Person temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void introduce () {
        System.out.println(toString());
    }
}

class Professor extends Teacher {
    private double salaryLevel = 1.3;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", post='" + super.getPost() + '\'' +
                ", salary=" + super.getSalary() +
                "salaryLevel=" + salaryLevel +
                '}';
    }

    @Override
    public void introduce() {
        System.out.println(toString());
    }
}
