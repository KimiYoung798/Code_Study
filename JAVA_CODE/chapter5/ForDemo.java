public class ForDemo {
	public static void main(String[] args) {
		//��ӡ1-100֮��9�ı�����������ͳ�Ƹ������ܺ�
		//�����ܺ�sum,������count
		int sum = 0;
		int count = 0;
		//forѭ��1-100
		for(int i = 1; i <= 100; i++){
			//�ж�9�ı���
			if(i % 9 == 0){
				System.out.println(i);
				sum += i;
				count ++;
			}
		}
		System.out.println("1-100֮��9�ı����ĸ�����" + count);
		System.out.println("1-100֮��9�ı������ܺͣ�" + sum);
		

	}
}