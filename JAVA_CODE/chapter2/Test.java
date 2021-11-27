//第二章
//什么是程序？
//	计算机执行某些操作或解决某个问题而编写的一系列有序指令的集和
//最简单的程序 完成1+1

public class Test {
	public static void main(String[] args){
		int res = 1 + 1;
		//输出
		System.out.println("结果=" + res);
	}
}

//95年发布的第一个版本，java之父gosling，09年甲骨文收购，常用8 11 LTS;
//SE 标准版 EE 企业版 ME 移动端；
//重要特点：
//	面向对象（oop）
//	健壮的，强类型机制，异常处理，垃圾自动手机
//	跨平台性 -> .java->.class >> 在多平台运行不需要重新编译（虚拟机机制）
//	解释型语言 
//		class 文件 不能直接被机器执行，需要解释器来执行
//		其实Java既是解释型语言又是编译型语言，因为要编译成class字节码文件