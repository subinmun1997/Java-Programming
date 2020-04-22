import java.util.Arrays;

class DoubleStream {
	public static void main(String[] args) {
		double[] ds = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		Arrays.stream(ds)
		      .forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		Arrays.stream(ds,1,4)
		      .forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}
}
