package houserent.view;

/*
* 显示界面
* 接收用户输入
* 调用HouseService完成对房屋信息各种操
*
* */
public class HouseView {

    private boolean loop = true;//控制显示主菜单
    private char key = ' ';//接收用户选择

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



        }while(loop);
    }
}
