package com.exception_;

public class Exception01 {
    public static void main(String[] args) {
        //NullPointerException
        String name = null;
        System.out.println(name.length());
        //ArithmeticException
        //ArrayIndexOutOfBoundsException
        int[] arr = {1,2,4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }

        //ClassCastException
        //试图将对象强制转换为不是实例的子类时，抛出该异常
        A b = new B();//父类的变量名指向子类的实例，向上转型
        B b2 = (B)b; //向下转型
        C c = (C)b;//抛出ClassCastException
        //NumberFormatException
        //当应用程序试图将字符串转换成一种数值类型时，但是不能转换为适当格式则抛出异常
        String test = "hello";
        int num = Integer.parseInt(name);
    }
}

class A {}
class B extends A {}
class C extends A {}