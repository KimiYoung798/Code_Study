package com.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {

        List list = new ArrayList();
//        1.add
        list.add("jack");
        list.add(1);
        list.add(true);
        System.out.println(list);
//        2.remove
        list.remove("jack");
        list.remove(1);
        list.remove(true);
        System.out.println(list);
//        3.contains查找元素是否存在
        System.out.println(list.contains(1));
        System.out.println(list.contains(true));
//        4.size 获取元素个数
        System.out.println(list.size());
//        5.isEmpty 判断是否为空
        System.out.println(list.isEmpty());
//        6.clear 清空
        list.clear();
        System.out.println(list);
//        7.addAll 添加多个
        ArrayList list1 = new ArrayList();
        list1.add("西游记");
        list1.add("三国演义");
        list1.add("红楼梦");
        list1.add("水浒传");
        list.addAll(list1);
        System.out.println(list);
//        8.containsAll 查找多个元素是否都存在
        System.out.println(list.contains("水浒传"));
//        9.removeAll 删除多个
        list.removeAll(list1);
        System.out.println(list);
//        10.

    }

    public static void collectionIterator(List coll) {
        Iterator it = coll.iterator();//得到一个集合的迭代器
        //hasNext():判断是否还有下一个元素
        while(it.hasNext()){
            //next();指针下移，且返回元素
            System.out.println(it.next());
        }

        for (int i = 0; i < coll.size(); i++) {
            coll.contains(i);
        }
    }

    public static void enhanceFor(List coll) {
        for (Object ele : coll) {
            System.out.println(ele);
        }

        int[] numbs = {1,2,3,4,5,6};
        for (Object i : numbs) {
            System.out.println(i);
        }
     }

}
