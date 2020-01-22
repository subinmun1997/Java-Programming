import java.io.*;
public class AB_Combination {
	public static void main(String[] args) {
		int A,B;
		int result;
		for(A=0;A<9;A++) {
			for(B=0;B<9;B++) {
				result=(10*A+10*B)+(A+B);
				if(result==99) {
					System.out.println(A+","+B);
				}
			}
		}
	}
}
