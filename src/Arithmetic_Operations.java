import java.io.*;
public class Arithmetic_Operations {
	public static void main(String[] args) {
		int n1=10, n2=4;
		oper(10,4);
		
	}
	public static void oper(int n1, int n2) {
		System.out.println("�� ���� ��:"+(n1+n2));
		System.out.println("�� ���� ��:"+(n1*n2));
		System.out.println("�� ���� ��:"+(n1-n2));
		System.out.println("�� ���� ��:"+(n1/n2));
		System.out.println("�� ���� ������:"+(n1%n2));
	}
}
