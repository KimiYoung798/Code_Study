package com.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List list = new ArrayList();
//        1.add
        list.add("西游记");
        list.add("水浒传");
        list.add("红楼梦");
        list.add(0,"三国");
        System.out.println(list);
//        2.addAll
        List list1 = new ArrayList();
        list1.add("索尼");
        list1.add("东芝");
        list.addAll(1, list1);
        System.out.println(list);
//        3.get
        System.out.println(list.get(2));
//        4.indexOf
        System.out.println(list.indexOf("东芝"));
//        5.lastIndex
        System.out.println(list.indexOf("东芝"));
//        6.remove

//        7.set相当于替换
        list.set(1,"松下");
        System.out.println(list);
//        8.subList，左闭右开
        System.out.println(list.subList(1,3));

    }
}
