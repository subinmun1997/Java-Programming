import java.io.*;
public class OnlyExitReturn {
	public static void main(String[] args) {
		divide(4,2);
		divide(6,2);
		divide(9,0);
	}
	public static void divide(int n1, int n2) {
		if(n2==0) {
			System.out.println("0���δ� ���� �� �����.");
			return;
		}
		System.out.println("������ ���:"+(n1/n2));
	}
}
