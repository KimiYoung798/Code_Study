package com.exception_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }

    public void file1() throws FileNotFoundException {
        //创建一个文件流对象
        /*
        * 这里异常是编译时异常，必须处理
        * 可以使用try-catch
        * 使用throws，抛出异常，让调用file1方法的调用者处理异常
        * Throws关键后面可以是异常类型可以是方法中产生的异常类型也可以是其父类
        * 也可以是 异常列表，即抛出多个异常
        * */
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
