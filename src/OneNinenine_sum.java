import java.io.*;
public class OneNinenine_sum {
	public static void main(String[] args) {
		int n=1;
		int sum=0;
		
		while(n<100) {
			sum+=n;
			n++;
		}
		System.out.println("1���� 99������ ��:"+sum);
	}
}
