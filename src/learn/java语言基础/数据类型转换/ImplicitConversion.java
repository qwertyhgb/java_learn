package learn.java语言基础.数据类型转换;

public class ImplicitConversion {
	public static void main(String[] args) {
		//声明byte型变量mybyte，并把byte变量允许的最大值赋值给mybyte
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		/* 输出运输算的结果 */
		System.out.println("byte型与float型数据进行运算结果为：" + (mybyte + myfloat));
		System.out.println("byte与int的运算结果为：" + mybyte * myint);
		System.out.println("byte与char的预算结果为：" + mybyte / mychar);
		System.out.println("double与char的运算结果为：" + (mydouble + mychar));
}
}