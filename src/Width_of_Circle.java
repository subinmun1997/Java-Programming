import java.io.*;
public class Width_of_Circle {
	public static void main(String[] args) {
		int red=5;
		System.out.println("���� ���̿� �ѷ��� ����ϴ� �޼ҵ�");
		System.out.println("���� ����:"+diameter(red));
		System.out.println("���� �ѷ�:"+circum(red));
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
