import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        MyTools tool = new MyTools();
        int[] arr = {23,543,65,1313,634,23,54,1342,542};
        System.out.println("原数组：");
        tool.printArray(arr);
        tool.bubble(arr);
        System.out.println("排序后：");
        tool.printArray(arr);
    }
}

//创建一个MyTools，编写方法，完成对int数组冒泡排序
class MyTools {

    public void bubble(int[] arr) {
        //冒泡排序
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] =temp;
                }
            }
        }
    }

    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}