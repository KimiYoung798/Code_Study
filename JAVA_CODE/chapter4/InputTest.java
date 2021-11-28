import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		//演示用户输入

		//首先，引入Scanner类
		//创建Scanner对象
		Scanner scanner = new Scanner(System.in);
		//接受用户输入
		System.out.println("输入名字");
		String name = scanner.next();
		System.out.println("输入年龄");
		int age = scanner.nextInt();
		System.out.println("输入薪水");
		double sal = scanner.nextDouble();
		//输出
		System.out.println("信息如下");
		System.out.println("名字：" + name);
		System.out.println("年龄：" + age);
		System.out.println("薪水：" + sal);

	}
}