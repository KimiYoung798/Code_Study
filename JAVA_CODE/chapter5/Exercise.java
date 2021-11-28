import java.util.*;

public class Exercise {
	public static void main(String[] args) {
		//1.实现编程功能，
		//某人由100000元，经过一次路口，现金>50000 交5%，<=50000 交1000，
		//问可以走多少次路口？
		double cash = 100000;
		//计数器
		int count = 0;
		while(true) {
			if(cash >= 0){
				if(cash > 50000){
					cash = cash * (1 - 0.05);
					count ++;
				}else if(cash <= 50000){
					cash = cash - 1000;
					count ++;
				}
			}else{
				System.out.println("可经过路口数量：" + count);
				break;
			}
		}

		//2.输出1-100之间不能被5整除的数，5个一行
		count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0) {
				count++;
				System.out.print(i + " ");	
				if(count % 5 == 0){
					System.out.print("\n");
				}
			}
		}

		// 计算 1-1/2+1/3-1 ... 1/100 的和
		// (-1)^(n-1)/n，学好数学很重要，数列问题求和
		double num = 1;
		double sum = 0;
		for(;num <= 100; num++) {
			sum += Math.pow(-1, num - 1)/num;
		}
		System.out.println("sum" + sum);

		// 计算1+(1+2)+(1+2+3)...(1+...+100)
		// an = n
		// bn = Sn = n*a1 + n(n-1)d/2
		sum = 0;
		//n项
		int n = 0;
		for(n = 1; n <= 100; n++) {
			sum += (n + n*(n - 1)/2);
		}
		System.out.println("sum" + sum);
	}
}
