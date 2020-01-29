class Accumulator {
	static int sum =0;
	
	static void add(int num) {
		sum+=num;
	}
	static void showResult() {
		System.out.println("sum: "+sum);
	}
	
	
	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++) {
			Accumulator.add(i);
		}
		Accumulator.showResult();
	}
}
