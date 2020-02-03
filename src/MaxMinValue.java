class MaxMinValue{
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println("ÃÖ¼Ú°ª ¹ÝÈ¯: "+minValue(arr));
		System.out.println("ÃÖ´ñ°ª ¹ÝÈ¯: "+maxValue(arr));
	}
}