import java.io.*;
public class InfRecul {
	public static void main(String[] args) {
		showHi(3);
	}

	public static void showHi(int n) {
		if(n==1) 
			return;
		
		showHi(--n);
		
	}
}
