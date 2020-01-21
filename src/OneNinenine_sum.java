import java.io.*;
public class OneNinenine_sum {
	public static void main(String[] args) {
		int n=1;
		int sum=0;
		
		while(n<100) {
			sum+=n;
			n++;
		}
		System.out.println("1부터 99까지의 합:"+sum);
	}
}
