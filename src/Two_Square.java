import java.io.*;
public class Two_Square {
	public static void main(String[] args) {
		System.out.println("2�� 3��:"+squ(3));
		System.out.println("2�� 6��:"+squ(6));
		System.out.println("2�� 8��:"+squ(8));
	}
	public static int squ(int n) {
		if(n==0) {
			return 1;
		}
		return 2*squ(n-1);
	}
}
