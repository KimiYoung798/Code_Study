import java.util.*;

public class Sum {

	int flag = 0;

	public static void main(String[] args) {
		//��ȡ����������鳤��
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		int length = sc.nextInt();
		//��������
		
		Sum s = new Sum();
		double[] nums = new double[length];
		for(int i = 0; i < length; i++) {
			System.out.println("�����" + (i+1) + "����");
			nums[i] = sc.nextDouble();
		}
		double res = s.sum(nums);
		System.out.println("res=" + res);

	}
	// ��ͷ���
	// �ݹ�ʵ�֣�
	public double sum(double... nums){
		
		if(flag == (nums.length - 1)){
			return nums[nums.length - 1];
		} else  {
			flag++;
			return sum(nums) + nums[flag];
		}	
	}

}