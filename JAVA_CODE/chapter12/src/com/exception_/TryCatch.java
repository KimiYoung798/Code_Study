package com.exception_;

public class TryCatch {
    public static void main(String[] args) {
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字：+" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息：" + e.getMessage());
        } finally {
            System.out.println("finally一定会执行");
        }
        System.out.println("继续执行");

    }
}
