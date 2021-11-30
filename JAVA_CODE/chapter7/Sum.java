import java.util.*;

public class Sum {

	int flag = 0;

	public static void main(String[] args) {
		//获取长度求和数组长度
		Scanner sc = new Scanner(System.in);
		System.out.println("输入计算个数");
		int length = sc.nextInt();
		//生成数组
		
		Sum s = new Sum();
		double[] nums = new double[length];
		for(int i = 0; i < length; i++) {
			System.out.println("输入第" + (i+1) + "个数");
			nums[i] = sc.nextDouble();
		}
		double res = s.sum(nums);
		System.out.println("res=" + res);

	}
	// 求和方法
	// 递归实现，
	public double sum(double... nums){
		
		if(flag == (nums.length - 1)){
			return nums[nums.length - 1];
		} else  {
			flag++;
			return sum(nums) + nums[flag];
		}	
	}

}