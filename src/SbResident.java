class SbResident {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("990925-1012999");
		sb.replace(6, 7, " ");
		System.out.println(sb.toString());
	}
}
