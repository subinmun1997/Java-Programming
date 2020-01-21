import java.io.*;
public class OneToTen {
	public static void main(String[] args) {
		int i,num=1;
		
		for(i=1;i<11;i++) {
			num*=i;
		}
		System.out.println("1부터 10까지의 곱: "+num);
	}
}
