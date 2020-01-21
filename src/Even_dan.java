import java.io.*;
public class Even_dan {
	public static void main(String[] args) {
		int i,j;
		for(i=2;i<9;i++) {
			for(j=1;j<9;j++) {
				
				
				
				
				
				
				if((i%2)==0 && (i<j)) 
					break;
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.print("\n");
		}
	}

}
