import java.util.*;

public class Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Algorithm f1 = new Algorithm();
		
		f1.algorithm1(4);
		int res = f1.factorial(4);
		System.out.println(res);
		//쳲�������
		System.out.println("����쳲��������и�����");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.print(f1.fibonacci(i) + " ");			
		}
		System.out.println("");
		//���ӳ���
		System.out.println("����������");
		int day = sc.nextInt();
		f1.monkeyEat(day);
		System.out.println("����������" + f1.monkeyEat(day));

		//�Թ�����
		//˼·
		//1. �ȴ����Թ����ö�ά�����ʾ int[][] map = new int[8][7];
		//2. �ȹ涨 map �����Ԫ��ֵ: 0 ��ʾ������ 1 ��ʾ�ϰ���
		int[][] map = new int[8][7];
		//3. ���������һ�к��������һ�У�ȫ������Ϊ 1
		for(int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.���������һ�к��������һ�У�ȫ������Ϊ 1
		for(int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
			map[3][1] = 1;
			map[3][2] = 1;
			map[2][2] = 1; //���Ի���
			// map[2][1] = 1;
			// map[2][2] = 1;
			// map[1][2] = 1;
		//�����ǰ�ĵ�ͼ
		System.out.println("=====��ǰ��ͼ���======");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//���һ��
			}
			System.out.println();
		}

		//��·
		f1.findWay(map, 1, 1);
		System.out.println("=====��ǰ��ͼ���======");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//���һ��
			}
			System.out.println();
		}

		//tower
		f1.moveTower(5, 'A', 'B', 'C');


		//8�ʺ�
		//����һ��queenMax ��ʾ���м����ʺ�
		int queenMax = 8;
		//����һ�����飬����λ�ӽ��
		int[] qArray = new int[queenMax];


		f1.check(0,qArray);
		System.out.println("�ⷨ������" + f1.count);

	}
}

class Algorithm {


	static int count = 0;

	//�ݹ������
	public void algorithm1(int n) {
		if (n > 2) {
			algorithm1(n - 1);
		}
		System.out.println(n);
	}
	//ʵ�ֵݹ���׳�
	public int factorial (int n) {
		// if(n > 2){
		// 	return factorial(n - 1) * n;
		// } else {
		// 	return n;
		// }
		if(n == 1){
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
	//ʹ�õݹ�д��쳲������� 1��1��2��3��5��8��13��������һ�������㣬�������ֵ�Ƕ���
	//F(0)=0��F(1)=1, F(n)=F(n - 1)+F(n - 2)
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("��������");
			return -1;
		}
	}

	//���ӳ������⣬ÿ�������һ���ٶ��һ������ʮ�죬��û�ԣ�����ֻ��һ�����ӣ��ʳ�ʼ���٣�
	//��ʼn�� day10 1p day9 (day10+1)*2
	public int monkeyEat(int day) {
		
		if(day == 10) {
			return 1;
		} else if(day >= 1 && day <= 9) {
			return (monkeyEat(day + 1) + 1) * 2;
		}else {
			System.out.println("day��1-10��");
			return -1;
		}
	}

	//�Թ�����
	//�ݹ����˼��
	//�ҵ�����true����ʼλ����i j
	//�涨��0��ʾ������ 1��ʾ�ϰ��� 2��ʾ������ 3��ʾ�߹����߲�ͨ
	//�˳��ݹ����� ��map[6][5] == 2 ˵���ҵ�ͨ·�����������
	//ȷ����·���ԣ���->��->��
	public boolean findWay(int[][] map, int i, int j) {

		if(map[6][5] == 2) {//˵���ҵ�·
			return true;
		} else {
			if(map[i][j] == 0) {//�����������
				//���������map[i][j] = 2;
				map[i][j] = 2;
				//ʹ�ò�����->��->��
				if(findWay(map, i + 1, j)) {//��
					return true;
				} else if(findWay(map, i, j + 1)) {//��
					return true;
				} else if(findWay(map, i - 1, j)) {//��
					return true;
				} else if(findWay(map, i, j - 1)) {//��
					return true;
				} else {
					map[i][j] = 3;//�������ߣ��߹��������߲�ͨ
					return false;
				}
			} else {// 1,2,3,����Ҫ��
				return false;
			}
		}

	}

	//��ŵ��
	// num���ƶ�������abc��ʾ��ABC
	public void moveTower(int num, char a, char b, char c) {
		if(num == 1) {//ֻ��һ���̣�
			System.out.println(a + "->" + c);
		} else {
			//���忰�������������
			//������˵���Ƶ�b������c
			moveTower(num - 1, a, c, b);
			//�����һ���Ƶ�c
			System.out.println(a + "->" + c);
			//����a��b�������Ƶ�c
			moveTower(num - 1, a, a, c);
		}
	}

	//�˻ʺ�����
	//��һ������ arr[8] �±�����У�ÿ��Ԫ�ش���һ���е�λ�� ��Χ 0-7��
	//�жϵ�n���ʺ󣬼���Ƿ���֮ǰ�ڷŵĳ�ͻ
	public boolean judgeQueen(int n, int[] qArray) {
		for (int i = 0; i < n; i++) {
			//�ж��Ƿ��ͻ
			if(qArray[i] == qArray[n] || Math.abs(n - i) == Math.abs(qArray[n] - qArray[i])) {
				return false;
			}
		}
		return true;
	}

	public void check(int n, int[] qArray) {
		if(n == 8) {
			count ++;
			for(int i = 0; i < qArray.length; i++) {
				System.out.print(qArray[i] + " ");
			}
			System.out.println(" ");
			return;
		}
		for (int i = 0; i < 8; i++) {
			qArray[n] = i;
			if(judgeQueen(n,qArray)) {
				check(n+1,qArray);
			}
		}
	}




}