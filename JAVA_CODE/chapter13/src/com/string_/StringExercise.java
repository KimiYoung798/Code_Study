package com.string_;

public class StringExercise {
    public static void main(String[] args) {
        //经典测试题
        //1.下面语句创建了几个对象
        String s = "Hello";// 先在常量池中创建hello，再将s1指向hello
        s = "haha";// 在常量池中创建haha，让s1指向hello
        //两个对象

        //面试题
        //1.创建了几个对象
        String a = "hello" + "abc";//编译器会优化，判断创建的常量池对象是否有引用指向
        // "hello" + "abc" => ”helloabc“
        //1个

        //2.创建了几个对象
        String x = "hello";
        String y = "abc";
        //1，先创建一个StringBuilder sb = StringBuilder()
        //2. 执行 sb.append("hello");进行追加
        //3. 执行 sb.append("abc");进行追加
        //4. String z = sb.toString();
        //最后z指向堆中的对象 value指向池中"helloabc"
        String z = x + y;// 与常量相加"hello" + "abc"不同
        // 3个
        /*
        * 小结
        * 底层是StringBuilder sb = new StringBuilder();
        * sb.append(a);
        * sb.append(b);
        * sb是在堆中的，并且append是在原来的字符串基础上追加的
        * 重要规则
        * String c = "a"+"b";常量相加，看的是池
        * String c = a + b;变量相加，是在堆中
        * */

        //题3
        String s1 = "zxc";//指向池
        String s2 = "java";//指向池
        String s3 = "zxcjava";//指向池
        String s4 = (s1 + s2).intern();//指向池中地址
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s4);

    }
}
