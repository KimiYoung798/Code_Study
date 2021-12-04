package static_;

public class ChildGame {
    public static void main(String[] args) {
        //统计有多少小孩加入游戏
        //int count = 0;

        Child tom = new Child("tom");
        tom.join();
        //count++;
        Child jack = new Child("jack");
        jack.join();
        //count++;
        Child mary = new Child("mary");
        mary.join();
        //count++;

        //类变量可以通过类名来访问
        System.out.println("一共有" + Child.count + "个小孩加入游戏");

    }
}

class Child {
    private String name;

    // 设计一个int count表示总人数，并且count是所有对象共享
    //定义一个count，是一个静态变量
    //该变量特点就是所有对象公用
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        count++;
        System.out.println(name + "加入了游戏。。。");
    }
}

