import java.util.*;

public class Exercise {
	public static void main(String[] args) {
		//1.ʵ�ֱ�̹��ܣ�
		//ĳ����100000Ԫ������һ��·�ڣ��ֽ�>50000 ��5%��<=50000 ��1000��
		//�ʿ����߶��ٴ�·�ڣ�
		double cash = 100000;
		//������
		int count = 0;
		while(true) {
			if(cash >= 0){
				if(cash > 50000){
					cash = cash * (1 - 0.05);
					count ++;
				}else if(cash <= 50000){
					cash = cash - 1000;
					count ++;
				}
			}else{
				System.out.println("�ɾ���·��������" + count);
				break;
			}
		}

		//2.���1-100֮�䲻�ܱ�5����������5��һ��
		count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0) {
				count++;
				System.out.print(i + " ");	
				if(count % 5 == 0){
					System.out.print("\n");
				}
			}
		}

		// ���� 1-1/2+1/3-1 ... 1/100 �ĺ�
		// (-1)^(n-1)/n��ѧ����ѧ����Ҫ�������������
		double num = 1;
		double sum = 0;
		for(;num <= 100; num++) {
			sum += Math.pow(-1, num - 1)/num;
		}
		System.out.println("sum" + sum);

		// ����1+(1+2)+(1+2+3)...(1+...+100)
		// an = n
		// bn = Sn = n*a1 + n(n-1)d/2
		sum = 0;
		//n��
		int n = 0;
		for(n = 1; n <= 100; n++) {
			sum += (n + n*(n - 1)/2);
		}
		System.out.println("sum" + sum);
	}
}
