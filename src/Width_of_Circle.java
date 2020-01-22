import java.io.*;
public class Width_of_Circle {
	public static void main(String[] args) {
		int red=5;
		System.out.println("원의 넓이와 둘레를 계산하는 메소드");
		System.out.println("원의 넓이:"+diameter(red));
		System.out.println("원의 둘레:"+circum(red));
	}
	public static double diameter(int n) {
		final double Pi=3.14;
		return n*n*Pi;
	}
	public static double circum(int n) {
		final double Pi=3.14;
		return 2*n*Pi;
	}
}
