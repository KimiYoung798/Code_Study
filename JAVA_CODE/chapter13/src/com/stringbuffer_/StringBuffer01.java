package com.stringbuffer_;

public class StringBuffer01 {



    public static void main(String[] args) {

        /*
        * 1.StringBuffer直接父类是AbstractStringBuilder
        * 2.StringBuffer实现了Serializable，可以串行化
        * 3.在父类中，AbstractStringBuilder 有属性 char[] value，不是final，可变，放在堆中
        * 4.StringBuffer是个final类
        *
        * */

//        StringBuffer stringBuffer = new StringBuffer("hello");
//        StringBuffer01 stringBuffer01 = new StringBuffer01();
//        stringBuffer01.loopTime();

        //String与StringBuffer之间转换
        //String -> StringBuffer
        String s = "hello";
        StringBuffer sb1 = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);

        //StringBuffer -> String
        String s1 = sb1.toString();
        String s2 = new String(sb1);


    }

    void loopTime() {
        long starTime = System.currentTimeMillis();
        stringBPlus();
        long endTime = System.currentTimeMillis();
        long usedTime = endTime - starTime;
        System.out.println(usedTime);

    }

    void stringBPlus() {
        StringBuffer s = new StringBuffer(16);
        for (int i = 0; i < 8000000; i++) {
            s.append("hello");
        }
    }
}
