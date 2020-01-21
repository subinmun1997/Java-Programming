import java.io.*;
public class OneToHundred {
	public static void main(String[] args) {
		int n=1;
		
		while(n<=100) 
			System.out.print(n++);
		
		System.out.println("\n");
	
		do {
			System.out.print(n--);
		}while(n>0);	
	}
}
