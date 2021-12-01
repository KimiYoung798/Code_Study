package com.override_exercise;

/*


3) 在 main 中,分别创建 Person 和 Student 对象，调用 say
*
*
* */
public class MainActivity {
    public static void main(String[] args) {
        System.out.println(
            new Person("xiaoming", 18).say()
        );
        System.out.println(
            new Student("xiaohong", 20, "2334545", 99).say()
        );

    }
}
