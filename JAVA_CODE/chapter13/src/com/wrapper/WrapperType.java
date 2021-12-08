package com.wrapper;

public class WrapperType {
    public static void main(String[] args) {

        //演示integer与int之间的装箱与拆箱
        int n1 = 100;
        //手动装箱
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        int i = integer.intValue();


        //自动装箱
        int n2 = 200;
        Integer integer2 = n2; //底层使用任然是valueOf
        //自动拆箱
        int n3 = integer2; //底层使用任然是value

        //面试题
        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1);//问输出什么
        //输出1.0，因为三元运算符看作一个整体，里面精度最高的是double，提升精度，所有输出是1.0

        //包装类与String转换
        Integer i1 = 100;
        //包装类->String
        String str1 = i1 + "";//方式一
        String str2 = i1.toString();//方式二
        String str3 = String.valueOf(i1);//方式三
        //String->包装类
        String str4 = "1234";
        Integer i2 = Integer.parseInt(str4);//自动装箱
        Integer integer3 = new Integer(str4);//构造器


    }

    //Integer面试题
    public void method1() {

        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//F

        Integer m = 1;//底层自动装箱 valueOf -》阅读源码
        Integer n = 1;  //This method will always cache values in the range -128 to 127,
        // inclusive, and may cache other values outside of this range.
        //在范围内就是直接返回数字，否则new Integer
        System.out.println(m == n);//t

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//f
    }

    public void method2() {
        //示例一
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//F
        //示例二
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//F

        //示例三
        Integer i5 = 127;//底层Integer.valueOf(127)
        Integer i6 = 127;//-128~127
        System.out.println(i5 == i6); //T
        //示例四
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//F
        //示例五
        Integer i9 = 127; //Integer.valueOf(127)
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//F

        //示例六
        Integer i11 = 127;
        int i12 = 127;
        //只有有基本数据类型，判断的是
        //值是否相同
        System.out.println(i11 == i12); //T
        //示例七
        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13 == i14);//T
    }
}
