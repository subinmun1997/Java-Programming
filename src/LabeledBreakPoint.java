import java.io.*;
public class LabeledBreakPoint {
	public static void main(String[] args) {
		int i,j;
outer:	for(i=1;i<10;i++) {
			for(j=1;j<10;j++) {
				if(i*j==72) {
					System.out.println(i+"x"+j+"="+(i*j));
					break outer;
				}
			}
		}
	}

}
