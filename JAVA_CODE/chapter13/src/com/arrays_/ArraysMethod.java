package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysMethod {
    public static void main(String[] args) {

        Integer[] integers = {1, -9, 3, 40, -54, 12, 0};

        //toString
        System.out.println(Arrays.toString(integers));
        //sort
        Arrays.sort(integers);
        System.out.println("排序后");
        System.out.println(Arrays.toString(integers));
        //拷贝数组，如果拷贝长度大于原来数组，就在后添加Null，拷贝数组小于零，抛出异常
        Integer[] newInt = Arrays.copyOf(integers, integers.length);
        System.out.println("定制排序");
        //传入Comparator实现定制排序，体现接口编程方式
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            //在匿名内部类中实现定制
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(integers));

        //binarySearch
        int index = Arrays.binarySearch(newInt, 12);
        System.out.println("index = " + index);
        //填充，全部替换1
        System.out.println("填充后");
        Arrays.fill(newInt, 1);
        System.out.println(Arrays.toString(newInt));

        //equals 比较两个数组是否一致
        System.out.println(Arrays.equals(integers, newInt));

        //asList
        List<Integer> al = Arrays.asList(2,3,4,5,6,7,8);
        System.out.println(al);

        System.currentTimeMillis();
    }
}
