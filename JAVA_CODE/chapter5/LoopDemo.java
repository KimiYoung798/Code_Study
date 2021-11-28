import java.util.*;
public class LoopDemo {

	public static void main(String[] args) {
		//实现99乘法表

		//存放数字变量
		int num1 = 1;
		int num2 = 1;

		for(; num1 <= 9; num1 ++){
			for (num2 = 1; num2 <= num1; num2++) {
				System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
				//错误思想，垃圾算法
				// switch(num1 ) {
				// 	case 1:
				// 		System.out.println(num1 + "*" + num2 + "=" + num1*num2 + "\n");
				// 		break;
				// 	case 2:
				// 		System.out.println(num1 + "*" + num2 + "=" + num1*num2 + "\t");
				// 		break;
				// 	case 3:
				// 		System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
				// 		break;
				// 	case 4:
				// 		System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
				// 		break;
				// 	case 5:
				// 		System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
				// 		break;
				// 	case 6:
				// 		System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
				// 		break;
				// 	case 7:
				// 		System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
				// 		break;
				// 	case 8:
				// 		System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
				// 		break;
				// 	case 9:
				// 		System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
				// 		break;
				// }
			}
			System.out.print("\n");
		}

		//经典打印金字塔
		//定义层数
		int totalLevel = 5;
		//
		for(int i = 0; i < totalLevel; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//正金字塔
		for(int i = 1; i <= totalLevel; i++) {
			for(int k = 1; k <= totalLevel-i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//空心金字塔
		for(int i = 1; i <= totalLevel; i++) {
			//System.out.print("*");
			for(int k = 1; k <= totalLevel-i; k++) {
				System.out.print(" ");
			}
			//System.out.print("*");
			for(int j = 1; j <= 2 * i - 1; j++) {
				if(j == 1 || j == 2 * i - 1 || i == totalLevel){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}			
			System.out.println("");
		}

		//输入层数生成金字塔
		System.out.println("输入金字塔层数：");
		//接收器

		Scanner scLevel = new Scanner(System.in);
		totalLevel = scLevel.nextInt();
		for(int i = 1; i <= totalLevel; i++) {
			//System.out.print("*");
			for(int k = 1; k <= totalLevel-i; k++) {
				System.out.print(" ");
			}
			//System.out.print("*");
			for(int j = 1; j <= 2 * i - 1; j++) {
				if(j == 1 || j == 2 * i - 1 || i == totalLevel){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}			
			System.out.println("");
		}


		//随机数多少次出现97
		int count = 0;
		while(true) {
			if((int)(Math.random() * 100) + 1 == 97){
				break;
			}
			count ++;
		}
		System.out.println(count);

	}
}