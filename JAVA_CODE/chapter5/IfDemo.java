import java.util.*;
/*
输入保国同志的芝麻信用分：
如果：
1) 信用分为 100 分时，输出 信用极好；
2) 信用分为(80，99]时，输出 信用优秀；
3) 信用分为[60,80]时，输出 信用一般；
4) 其它情况 ，输出 信用 不及格
5) 请从键盘输入保国的芝麻信用分，并加以判断
*/
public class IfDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入信用分：");
		//接收键盘输入
		int grade = scanner.nextInt();
		//输入数据范围判断
		if (grade >= 0 && grade <= 100){
			//判断业务
			if (grade == 100){
				System.out.println("信用极好");
			}else if (grade <= 99 && grade > 80){
				System.out.println("信用优秀");
			}else if (grade <= 80 && grade > 60 ){
				System.out.println("信用一般");
			}else {
				System.out.println("信用不及格");
			}
		}else{
			System.out.println("请输入0-100之间的数！！");
		}
	}
}