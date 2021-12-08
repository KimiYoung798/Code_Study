package com.exception_;

import java.util.Scanner;

public class TryCatchExercise {
    public static void main(String[] args) {
        //要求用户输入一个整数，若不是则提示他反复输入
        //思路 - 创建Scanner - 使用无限选循环 - 将输入值转换成int - 如果转换出异常，则输入有问题 - 输入正常break
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while(true) {

            System.out.println("输入一个整数");
            inputStr = sc.next();
            try {
                num = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入有误");
            }
        }
        System.out.println("你输入的是：" + num);
    }
}
