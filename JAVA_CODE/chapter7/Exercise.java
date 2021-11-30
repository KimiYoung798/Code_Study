public class Exercise {
	public static void main(String[] args) {
		//生成数组
		double[] arr = {12,54,65,12,43};
		//创建数字对象
		Numbers n1 = new Numbers();
		
		
		System.out.println("max = " + n1.max(arr));
		System.out.println("54下标 = " + n1.find(arr, 54));
		
	}
}

//题目 1，2
class Numbers {

	//方法一，实现找出最大值并返回
	double max(double[] arr) {
		double max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	//方法二，实现查找并返回index，否则返回-1
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
题目要求：
(1) 定义一个Circle类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积。
(2) 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
     public void printAreas(Circle c, int times) 	//方法签名/声明
(3) 在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
(4) 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示

 */
//定义一个Circle类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积。
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

 //(2) 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 //    public void printAreas(Circle c, int times) 	//方法签名/声明

class PassObject {
	public static void main(String[] args) {
		Circle c = new Circle();
		new PassObject().printAreas(c, 5);
	}

	public void printAreas(Circle c, int times) {
		System.out.println("radius\tareas");
		//在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。
		for(int i = 1; i <= times; i++) {
			c.setRadius(i);
			System.out.println(i + "\t" + c.findArea());
		}
		//例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
		//在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。
		//例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。

	}
}