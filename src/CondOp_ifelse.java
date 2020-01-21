import java.io.*;
public class CondOp_ifelse {
	public static void main(String[] args) {
		int num1=50;
		int num2=100;
	
		
		if(num1>num2) {
			System.out.println("big ="+num1);
		    System.out.println("diff ="+(num1-num2));
		}
		else {
			System.out.println("big ="+num2);
		    System.out.println("diff ="+(num2-num1));
		}
	}
}
