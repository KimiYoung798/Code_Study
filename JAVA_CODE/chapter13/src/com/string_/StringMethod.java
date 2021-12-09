package com.string_;

public class StringMethod {
    public static void main(String[] args) {
        //效率很低
//        StringMethod stringMethod = new StringMethod();
//        stringMethod.loopTime();

        String s = "hello";
        System.out.println(s.charAt(3));

    }

    void loopTime() {
        long starTime = System.currentTimeMillis();
        stringPlus();
        long endTime = System.currentTimeMillis();
        long usedTime = endTime - starTime;
        System.out.println(usedTime);

    }

    void stringPlus() {
        String s = new String("");
        for (int i = 0; i < 8000; i++) {
            s += "hello";
        }
    }
}

