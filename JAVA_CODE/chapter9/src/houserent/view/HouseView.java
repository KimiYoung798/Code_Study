package houserent.view;

import houserent.domain.House;
import houserent.service.HouseService;
import houserent.utils.Utility;

/*
* 显示界面
* 接收用户输入
* 调用HouseService完成对房屋信息各种操
*
* */
public class HouseView {

    private boolean loop = true;//控制显示主菜单
    private char key = ' ';//接收用户选择

    private HouseService u = new HouseService(0);


    //添加房屋，接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("------------添加房屋-------------");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone= Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(20);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        //创建House对象，注意id是系统分配，自增长
        u.add(new House(0,name,phone,address,rent,state));

    }
    //显示房屋列表
    public void listHouses() {
        System.out.println("------------房屋列表-------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = u.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }

    }
    //显示主菜单
    public void mainMenu() {

        do {
            System.out.println("------------房屋出租系统菜单-------------");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退出");
            System.out.println("请输入你的选择（1-6）：");
            key = Utility.readChar();
            switch (key) {
                case '1' :
                    addHouse();
                    break;
                case '2' :
                    System.out.println("查找");
                    break;
                case '3' :
                    System.out.println("删除");
                    break;
                case '4' :
                    System.out.println("修改");
                    break;
                case '5' :
                    listHouses();
                    break;
                case '6' :
                    System.out.println("退出");
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误");


            }

        }while(loop);
    }


}
