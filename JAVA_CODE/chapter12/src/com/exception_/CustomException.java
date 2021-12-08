package com.exception_;

public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        //
        if(!(age > 0 && age < 120)) {
            throw new AgeException("年龄需要在0-120之间");
        }

    }
}

//自定义一个异常
//一般自定义都是继承RuntimeException，好处是可以使用默认的处理机制
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}