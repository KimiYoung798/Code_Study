public class ArithmeticOperator {

	public static void main(String[] args) {
		
		// /ʹ��
		System.out.println(10 / 4); //����ѧ�Ƕȿ���2.5��JavaĬ��int��Ϊ2
		System.out.println(10.0 / 4); //��������

		double d = 10 / 4; //���2.0

		// %ʹ��
		// ���� һ����ʽ a % b = a - a / b * b
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);

		// ++
		// ����ʹ�ö�һ��
		int i = 10;
		i++;
		System.out.println("i++" + i);
		++i;
		System.out.println("++i" + i);

		//���ʽ
		int j = 8;
		int k = ++j;
		System.out.println("k=" + k + "j=" + j); //��������ֵ
		k = j++;
		System.out.println("k=" + k + "j=" + j);


		// ������
		i = 1;
		i = i++; //����ʹ����ʱ������(1) temp = i;(2) i=i+1;(3) i = temp;
		System.out.println(i);

		i = 1;
		i = ++i; //����ʹ����ʱ������(1) i=i+1;(2) temp = i;(3) i = temp;
		System.out.println(i);

	}
}