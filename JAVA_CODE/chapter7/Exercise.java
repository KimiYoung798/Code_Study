public class Exercise {
	public static void main(String[] args) {
		//��������
		double[] arr = {12,54,65,12,43};
		//�������ֶ���
		Numbers n1 = new Numbers();
		
		
		System.out.println("max = " + n1.max(arr));
		System.out.println("54�±� = " + n1.find(arr, 54));
		
	}
}

//��Ŀ 1��2
class Numbers {

	//����һ��ʵ���ҳ����ֵ������
	double max(double[] arr) {
		double max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	//��������ʵ�ֲ��Ҳ�����index�����򷵻�-1
	int find(double[] arr, double findNumber) {
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == findNumber) {
				index = i;
			}
		}
		return index;
	}
}

/*
��ĿҪ��
(1) ����һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��findArea()��������Բ�������
(2) ����һ����PassObject�������ж���һ������printAreas()���÷����Ķ������£�
     public void printAreas(Circle c, int times) 	//����ǩ��/����
(3) ��printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ����������磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����
(4) ��main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ���������н����ͼ��ʾ

 */
//����һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��findArea()��������Բ�������
 class Circle {
 	double radius;
 	// public Circle(radius) {
 	// 	this.radius = radius;
 	// }
 	public double findArea() {
 		return Math.PI * radius * radius;
 	}

 	public void setRadius(double radius) {
 		this.radius = radius;
 	}
 }

 //(2) ����һ����PassObject�������ж���һ������printAreas()���÷����Ķ������£�
 //    public void printAreas(Circle c, int times) 	//����ǩ��/����

class PassObject {
	public static void main(String[] args) {
		Circle c = new Circle();
		new PassObject().printAreas(c, 5);
	}

	public void printAreas(Circle c, int times) {
		System.out.println("radius\tareas");
		//��printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�������
		for(int i = 1; i <= times; i++) {
			c.setRadius(i);
			System.out.println(i + "\t" + c.findArea());
		}
		//���磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����
		//��printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�������
		//���磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����

	}
}