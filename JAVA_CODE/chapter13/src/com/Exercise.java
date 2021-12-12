package com;

import java.util.Locale;

public class Exercise {
    public static void main(String[] args) {
        String str = "1234567890";
        try {
            System.out.println(reverse(str, 5, 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    //1.将字符串指定部分反转
    public static String reverse(String str, int start, int end) {
        //添加验证
        //重要编程思想！！
        //先写出正确的情况，然后取反即可
        if (!(str != null && start >= 0 && end < str.length() && start < end)) {
            throw new RuntimeException("Error");
        }

        //将字符串转成字符数组进行操作
        char[] chars = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //传回字符串
        return new String(chars);
    }
}

class Exercise02 {
    public static void main(String[] args) {
        try {
            userRegister("kimi", "123456", "k@mxyz");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /*
     * 输入用户名、密码、邮箱，如果录入正确，提示成功，否则抛出异常
     * 1.用户名长度为2或3或4
     * 2.密码6位全数字
     * 3.邮箱包含@和. 且有顺序要求
     * */

    public static void userRegister(String name, String pwd, String email) {
        //针对输入内容进行校验
        //用户名
        if (!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }
        //密码
        if (!(pwd.length() == 6 && isNum(pwd))) {
            throw new RuntimeException("密码要求6位且全数字");
        }
        //email
        if (!(email.indexOf('@') > 0 && email.indexOf('.') > email.indexOf('@'))) {
            throw new RuntimeException("输入正确的电子邮箱");
        }
        System.out.println("注册成功");


    }

    //针对全数字判断写一个方法
    public static boolean isNum(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] < '0' && chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}

class Exercise03 {
    public static void main(String[] args) {

    }

    //对字符串按照要求格式输出
    public static void printStr(String str) {

        String[] strs = str.split(" ");

        String.format("%s,%s .%c", strs[2], strs[0], strs[1].toUpperCase().charAt(0));
    }

}