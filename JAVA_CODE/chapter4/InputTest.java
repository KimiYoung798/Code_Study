import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		//��ʾ�û�����

		//���ȣ�����Scanner��
		//����Scanner����
		Scanner scanner = new Scanner(System.in);
		//�����û�����
		System.out.println("��������");
		String name = scanner.next();
		System.out.println("��������");
		int age = scanner.nextInt();
		System.out.println("����нˮ");
		double sal = scanner.nextDouble();
		//���
		System.out.println("��Ϣ����");
		System.out.println("���֣�" + name);
		System.out.println("���䣺" + age);
		System.out.println("нˮ��" + sal);

	}
}