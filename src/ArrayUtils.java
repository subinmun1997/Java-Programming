import java.util.Arrays;

class ArrayUtils {
	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		int i;
		
		Arrays.fill(ar1,7);
		System.arraycopy(ar1, 0, ar2, 3, 4);
		
		for(i=0;i<ar1.length;i++) 
			System.out.print(ar1[i]+" ");
		
		System.out.println();
		
		for(i=0;i<ar2.length;i++) 
			System.out.print(ar2[i]+" ");
		
	}
}
