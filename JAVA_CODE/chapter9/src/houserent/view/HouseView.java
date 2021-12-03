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


    //添加房屋
    public void addHouse() {

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
                    System.out.println("新增");
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