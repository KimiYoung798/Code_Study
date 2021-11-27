public class IntDetail {

	public static void main(String[] args) {
		
		//java默认浮点为double ，声明float 后面加'f''F'

		//float num1 = 1.1 //不行
		float num2 = 1.1f; 
		double num3 = 1.1;
		double num4 = 1.1f;

		//浮点数表示形式有两种，十进制和科学计数法
		double num5 = 0.123; //等价double num5 = .123
		//科学计数法 5.12e2，5.12 * 10^2
		//推荐使用double

		//浮点数陷阱
		double num11 = 2.7;
		double num12 = 8.1 / 3;//输出接近2.7

		System.out.println(num11);

		System.out.println(num12);

		//重要：对运算结果是小数的相等判断要小心
		if (num11 == num12){
			System.out.println("相等");
		}
		//因该是两个数的差值的绝对值在某个精度范围内,根据具体的业务逻辑中设计精度
		if (Math.abs(num11 - num12) < 0.000001){
			System.out.println("相等");
		}

		//细节：赋值2.7就是2.7，计算后是精度范围




	}
}