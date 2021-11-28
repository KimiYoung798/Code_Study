public class ForDemo {
	public static void main(String[] args) {
		//打印1-100之间9的倍数的整数，统计个数及总和
		//声明总和sum,计数器count
		int sum = 0;
		int count = 0;
		//for循环1-100
		for(int i = 1; i <= 100; i++){
			//判断9的倍数
			if(i % 9 == 0){
				System.out.println(i);
				sum += i;
				count ++;
			}
		}
		System.out.println("1-100之间9的倍数的个数：" + count);
		System.out.println("1-100之间9的倍数的总和：" + sum);
		

	}
}