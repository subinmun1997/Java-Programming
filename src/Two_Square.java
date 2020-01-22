import java.io.*;
public class Two_Square {
	public static void main(String[] args) {
		System.out.println("2ÀÇ 3½Â:"+squ(3));
		System.out.println("2ÀÇ 6½Â:"+squ(6));
		System.out.println("2ÀÇ 8½Â:"+squ(8));
	}
	public static int squ(int n) {
		if(n==0) {
			return 1;
		}
		return 2*squ(n-1);
	}
}
