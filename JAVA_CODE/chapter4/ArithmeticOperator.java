public class ArithmeticOperator {

	public static void main(String[] args) {
		
		// /使用
		System.out.println(10 / 4); //从数学角度看是2.5，Java默认int，为2
		System.out.println(10.0 / 4); //提升精度

		double d = 10 / 4; //结果2.0

		// %使用
		// 本质 一个公式 a % b = a - a / b * b
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);

		// ++
		// 独立使用都一样
		int i = 10;
		i++;
		System.out.println("i++" + i);
		++i;
		System.out.println("++i" + i);

		//表达式
		int j = 8;
		int k = ++j;
		System.out.println("k=" + k + "j=" + j); //先自增后赋值
		k = j++;
		System.out.println("k=" + k + "j=" + j);


		// 面试题
		i = 1;
		i = i++; //规则使用临时变量，(1) temp = i;(2) i=i+1;(3) i = temp;
		System.out.println(i);

		i = 1;
		i = ++i; //规则使用临时变量，(1) i=i+1;(2) temp = i;(3) i = temp;
		System.out.println(i);

	}
}