import java.util.*;
/*
���뱣��ͬ־��֥�����÷֣�
�����
1) ���÷�Ϊ 100 ��ʱ����� ���ü��ã�
2) ���÷�Ϊ(80��99]ʱ����� �������㣻
3) ���÷�Ϊ[60,80]ʱ����� ����һ�㣻
4) ������� ����� ���� ������
5) ��Ӽ������뱣����֥�����÷֣��������ж�
*/
public class IfDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������÷֣�");
		//���ռ�������
		int grade = scanner.nextInt();
		//�������ݷ�Χ�ж�
		if (grade >= 0 && grade <= 100){
			//�ж�ҵ��
			if (grade == 100){
				System.out.println("���ü���");
			}else if (grade <= 99 && grade > 80){
				System.out.println("��������");
			}else if (grade <= 80 && grade > 60 ){
				System.out.println("����һ��");
			}else {
				System.out.println("���ò�����");
			}
		}else{
			System.out.println("������0-100֮���������");
		}
	}
}