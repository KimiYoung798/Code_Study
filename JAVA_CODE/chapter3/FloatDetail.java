public class IntDetail {

	public static void main(String[] args) {
		
		//javaĬ�ϸ���Ϊdouble ������float �����'f''F'

		//float num1 = 1.1 //����
		float num2 = 1.1f; 
		double num3 = 1.1;
		double num4 = 1.1f;

		//��������ʾ��ʽ�����֣�ʮ���ƺͿ�ѧ������
		double num5 = 0.123; //�ȼ�double num5 = .123
		//��ѧ������ 5.12e2��5.12 * 10^2
		//�Ƽ�ʹ��double

		//����������
		double num11 = 2.7;
		double num12 = 8.1 / 3;//����ӽ�2.7

		System.out.println(num11);

		System.out.println(num12);

		//��Ҫ������������С��������ж�ҪС��
		if (num11 == num12){
			System.out.println("���");
		}
		//������������Ĳ�ֵ�ľ���ֵ��ĳ�����ȷ�Χ��,���ݾ����ҵ���߼�����ƾ���
		if (Math.abs(num11 - num12) < 0.000001){
			System.out.println("���");
		}

		//ϸ�ڣ���ֵ2.7����2.7��������Ǿ��ȷ�Χ




	}
}