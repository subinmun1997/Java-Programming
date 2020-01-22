import java.io.*;
public class MethodReturns {
	public static void main(String[] args) {
		int result;
		result = adder(4,5);
		System.out.println("4+5="+result);
		System.out.println("3.5x3.5="+square(3.5));
	}
	
	public static int adder(int n1,int n2) {
		int addresult = n1+n2;
		return addresult;
	}
	public static double square(double n3) {
		return n3*n3;
	}
}
