public class Exercise {

	public static void main(String[] args) {
		//1.��֪��һ���������飬Ҫ�����һ��Ԫ�أ�ʹ����Ȼ����
		//{10��12��45��90} ��� 23
		int[] arr1 = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1;
		//
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] > insertNum) {
				index = i;//ȷ������
				break;
			}
		}
		//�ж�indexֵ
		if(index == -1) {
			index = arr1.length;
		}
		//����
		int[] newArr1  = new int[arr1.length + 1];
		//
		for(int i = 0, j = 0; i < newArr1.length; i++) {
			if(i != index){
				newArr1[i] = arr1[j];
				j++;

			}else if(i == index){
				newArr1[i] = insertNum;
			}
		}
		//arrָ��newarr
		arr1 = newArr1;
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("");
		//2.�������10������1-100���ڱ��浽���飬
		// �������ӡ��ƽ��ֵ�����ֵ�����ֵ�±��������Ƿ���8
		int[] arrNum = new int[10];
		double sum = 0;
		double avg = 0;
		int maxIndex = 0;
		int flag8 = -1;
		for(int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int)(Math.random() * 100) + 1;
		}
		//���ԭ˳��
		System.out.println("���ԭ˳��");
		for(int i = 0; i < arrNum.length; i++) {
			//��ƽ��ֵ
			sum += arrNum[i];
			avg = sum/arrNum.length;
			//�����ֵ�����±�
			//int flag = 0;
			if(arrNum[i] > arrNum[maxIndex]) {
				maxIndex = i;
			}
			//�ж��Ƿ���8
			if(arrNum[i] == 8) {
				flag8 = i;
			}

			System.out.print(arrNum[i] + " ");
		}
		//�������
		System.out.println("");
		System.out.println("�������");
		for(int i = arrNum.length - 1; i >= 0; i--) {
			System.out.print(arrNum[i] + " ");
		}
		//ƽ��ֵ
		System.out.println("");
		System.out.println("ƽ��ֵ��" + avg);
		//���ֵ�����ֵ�±�
		System.out.println("���ֵ��" + arrNum[maxIndex]);
		System.out.println("���ֵ�±꣺" + maxIndex);
		//�������Ƿ���8
		if(flag8 == -1) {
			System.out.println("��8");
		}else {
			System.out.println("��8");
		}
	}
}