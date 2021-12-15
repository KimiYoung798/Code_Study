package com.set_;

public class HashSetStructure {
    public static void main(String[] args) {
        //模拟HashMap底层

        //1.创建一个数组，数据类型为Node
        //node数组称为表
        Node[] table = new Node[16];
        System.out.println(table);
        //2.创建节点
        Node john = new Node("john", null);

        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;//将jack挂载在john后面
        Node rose = new Node("rose", null);
        jack.next = rose;

        System.out.println(table);

    }
}

class Node { //结点，存储数据，可以指向下一个节点，形成链表
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
