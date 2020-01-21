import java.io.*;
public class Odd_Sum {
	public static void main(String[] args) {
		int n=1;
		int sum=0;
		
		while(true) {
			if((n%2)!=0) 
				sum+=n;
			if(sum>1000) {
				System.out.println(n);
				System.out.println(sum);
				break;
			}
			n++;
		}
	}
}
