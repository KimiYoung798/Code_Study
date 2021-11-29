public class Exercise {

	public static void main(String[] args) {
		//1.已知有一个升序数组，要求插入一个元素，使其依然升序
		//{10，12，45，90} 添加 23
		int[] arr1 = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1;
		//
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] > insertNum) {
				index = i;//确定坐标
				break;
			}
		}
		//判断index值
		if(index == -1) {
			index = arr1.length;
		}
		//扩容
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
		//arr指向newarr
		arr1 = newArr1;
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("");
		//2.随机生成10个整数1-100以内保存到数组，
		// 并倒序打印求平均值、最大值，最大值下表，并查找是否有8
		int[] arrNum = new int[10];
		double sum = 0;
		double avg = 0;
		int maxIndex = 0;
		int flag8 = -1;
		for(int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int)(Math.random() * 100) + 1;
		}
		//输出原顺序
		System.out.println("输出原顺序");
		for(int i = 0; i < arrNum.length; i++) {
			//求平均值
			sum += arrNum[i];
			avg = sum/arrNum.length;
			//求最大值极其下表
			//int flag = 0;
			if(arrNum[i] > arrNum[maxIndex]) {
				maxIndex = i;
			}
			//判断是否有8
			if(arrNum[i] == 8) {
				flag8 = i;
			}

			System.out.print(arrNum[i] + " ");
		}
		//逆序输出
		System.out.println("");
		System.out.println("逆序输出");
		for(int i = arrNum.length - 1; i >= 0; i--) {
			System.out.print(arrNum[i] + " ");
		}
		//平均值
		System.out.println("");
		System.out.println("平均值：" + avg);
		//最大值，最大值下表
		System.out.println("最大值：" + arrNum[maxIndex]);
		System.out.println("最大值下标：" + maxIndex);
		//并查找是否有8
		if(flag8 == -1) {
			System.out.println("无8");
		}else {
			System.out.println("有8");
		}
	}
}