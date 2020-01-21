import java.io.*;
public class Multiple_2_7 {
	public static void main(String[] args) {
		int n=1;
		int sum=0;
		
		while(n<=1000) {
			if((n%2)==0 && (n%7)==0) {
				System.out.print(n );
				sum+=n;
			}
			n++;
		}
		System.out.println("수들의 합:"+sum);
	}
}
