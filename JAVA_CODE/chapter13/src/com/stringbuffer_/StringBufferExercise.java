package com.stringbuffer_;

import java.util.Scanner;

public class StringBufferExercise {
    public static void main(String[] args) {
        //题1
//        String str = null;// ok
//        StringBuffer sb = new StringBuffer(); //ok
//        sb.append(str);//需要看源码 , 底层调用的是 AbstractStringBuilder 的 appendNull
//        System.out.println(sb.length());//4
//        System.out.println(sb);//null
//
//        //下面的构造器，会抛出 NullpointerException
//        StringBuffer sb1 = new StringBuffer(str);//看底层源码 super(str.length() + 16);
//        System.out.println(sb1);

        //题2
        /*
        输入商品名称和商品价格，要求打印效果示例, 使用前面学习的方法完成：
        商品名 商品价格
        手机 123,564.59 //比如 价格 3,456,789.88
        要求：价格的小数点前面每三位用逗号隔开, 在输出/*
        */

        //接收输入的价格
        Scanner scanner = new Scanner(System.in);
        StringBuffer price = new StringBuffer(scanner.next());
        //用StringBuffer中insert实现插入，
        //找到小数点索引，然后在该位置前三位插入，即可

        int i = price.lastIndexOf(".");
        if(i == -1) {
            for (i = price.length() - 3; i > 0; i -= 3) {
                price = price.insert(i, ",");
            }
        } else {
            for (i -= 3; i > 0; i -= 3) {
                price = price.insert(i, ",");
            }
        }

        System.out.println(price);

    }
}


