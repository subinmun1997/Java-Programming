class RemoveBar {
	public static void main(String[] args) {
		String st1 = "990925-1012999";
		String st2 = st1.substring(0,6) + ' ' + st1.substring(7);
		
		System.out.println(st2);
	}

}
