import java.io.*;
public class Absolute {
	public static void main(String[] args) {
		int n1=14,n2=26;
		absol(14,26);
		absol(26,14);
	}
	public static void absol(int n1, int n2) {
		if(n1>n2) 
			System.out.println("두 수의 차:"+(n1-n2));
		
		else 
			System.out.println("두 수의 차:"+(n2-n1));
		
	}
}
