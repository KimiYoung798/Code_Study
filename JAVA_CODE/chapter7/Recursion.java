import java.util.*;

public class Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Algorithm f1 = new Algorithm();
		
		f1.algorithm1(4);
		int res = f1.factorial(4);
		System.out.println(res);
		//斐波那契数
		System.out.println("输入斐波那契数列个数：");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.print(f1.fibonacci(i) + " ");			
		}
		System.out.println("");
		//猴子吃桃
		System.out.println("输入天数：");
		int day = sc.nextInt();
		f1.monkeyEat(day);
		System.out.println("桃子数量：" + f1.monkeyEat(day));

		//迷宫问题
		//思路
		//1. 先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
		//2. 先规定 map 数组的元素值: 0 表示可以走 1 表示障碍物
		int[][] map = new int[8][7];
		//3. 将最上面的一行和最下面的一行，全部设置为 1
		for(int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.将最右面的一列和最左面的一列，全部设置为 1
		for(int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
			map[3][1] = 1;
			map[3][2] = 1;
			map[2][2] = 1; //测试回溯
			// map[2][1] = 1;
			// map[2][2] = 1;
			// map[1][2] = 1;
		//输出当前的地图
		System.out.println("=====当前地图情况======");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}

		//找路
		f1.findWay(map, 1, 1);
		System.out.println("=====当前地图情况======");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}

		//tower
		f1.moveTower(5, 'A', 'B', 'C');


		//8皇后
		//定义一个queenMax 表示共有几个皇后
		int queenMax = 8;
		//定义一个数组，放置位子结果
		int[] qArray = new int[queenMax];


		f1.check(0,qArray);
		System.out.println("解法数量：" + f1.count);

	}
}

class Algorithm {


	static int count = 0;

	//递归初体验
	public void algorithm1(int n) {
		if (n > 2) {
			algorithm1(n - 1);
		}
		System.out.println(n);
	}
	//实现递归算阶乘
	public int factorial (int n) {
		// if(n > 2){
		// 	return factorial(n - 1) * n;
		// } else {
		// 	return n;
		// }
		if(n == 1){
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
	//使用递归写出斐波那契数 1，1，2，3，5，8，13，，，给一个整数你，求出他的值是多少
	//F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("输入有误：");
			return -1;
		}
	}

	//猴子吃桃问题，每天吃其中一半再多吃一个，第十天，还没吃，发现只有一个桃子，问初始多少？
	//初始n个 day10 1p day9 (day10+1)*2
	public int monkeyEat(int day) {
		
		if(day == 10) {
			return 1;
		} else if(day >= 1 && day <= 9) {
			return (monkeyEat(day + 1) + 1) * 2;
		}else {
			System.out.println("day在1-10内");
			return -1;
		}
	}

	//迷宫问题
	//递归回溯思想
	//找到返回true，初始位置用i j
	//规定，0表示可以走 1表示障碍物 2表示可以走 3表示走过但走不通
	//退出递归条件 当map[6][5] == 2 说明找到通路；否则继续找
	//确定找路策略，下->右->上
	public boolean findWay(int[][] map, int i, int j) {

		if(map[6][5] == 2) {//说明找到路
			return true;
		} else {
			if(map[i][j] == 0) {//等于零可以走
				//假设可以走map[i][j] = 2;
				map[i][j] = 2;
				//使用策略下->右->上
				if(findWay(map, i + 1, j)) {//下
					return true;
				} else if(findWay(map, i, j + 1)) {//右
					return true;
				} else if(findWay(map, i - 1, j)) {//上
					return true;
				} else if(findWay(map, i, j - 1)) {//左
					return true;
				} else {
					map[i][j] = 3;//都不能走，走过，但是走不通
					return false;
				}
			} else {// 1,2,3,不需要走
				return false;
			}
		}

	}

	//汉诺塔
	// num是移动个数，abc表示塔ABC
	public void moveTower(int num, char a, char b, char c) {
		if(num == 1) {//只有一个盘，
			System.out.println(a + "->" + c);
		} else {
			//整体堪称上面和最下面
			//将上面说有移到b，借助c
			moveTower(num - 1, a, c, b);
			//把最后一个移到c
			System.out.println(a + "->" + c);
			//借助a把b所有盘移到c
			moveTower(num - 1, a, a, c);
		}
	}

	//八皇后问题
	//用一个数组 arr[8] 下标代表行，每个元素代表一列中的位置 范围 0-7，
	//判断第n个皇后，检测是否与之前摆放的冲突
	public boolean judgeQueen(int n, int[] qArray) {
		for (int i = 0; i < n; i++) {
			//判断是否冲突
			if(qArray[i] == qArray[n] || Math.abs(n - i) == Math.abs(qArray[n] - qArray[i])) {
				return false;
			}
		}
		return true;
	}

	public void check(int n, int[] qArray) {
		if(n == 8) {
			count ++;
			for(int i = 0; i < qArray.length; i++) {
				System.out.print(qArray[i] + " ");
			}
			System.out.println(" ");
			return;
		}
		for (int i = 0; i < 8; i++) {
			qArray[n] = i;
			if(judgeQueen(n,qArray)) {
				check(n+1,qArray);
			}
		}
	}




}