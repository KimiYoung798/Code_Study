import java.util.*;

public class SwitchDemo {
	public static void main(String[] args) {
// 		1) 使用 switch 把小写类型的 char 型转为大写(键盘输入)。只转换 a, b, c, d, e. 其它的输出 "other"。
		//创建Scanner
		Scanner scanner = new Scanner(System.in);
		//输入提示
		System.out.println("输入字母：");
		//接收输入
		char letter = scanner.next().charAt(0);

		switch (letter) {
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;	
			default :
				System.out.println("输入有误");	
		}

// 		2) 对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
// 		3) 根据用于指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 [课堂练习, 提示 使用穿透 ]

		//接收键盘输入
		System.out.println("输入月份：");
		Scanner csMonth = new Scanner(System.in);
		int month = csMonth.nextInt();
		//
		switch(month) {
			case 12:
			case 1:
			case 2:
				System.out.println("这是冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("这是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("这是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("这是秋季");
				break;
			default:
				System.out.println("输入的有问题");
				break;
		}
	}
}