class CompString {
	public static void main(String[] args) {
		String str1 = "Lexicographically";
		String str2 = "lexicographically";
		int cmp;
		
		if(str1.contentEquals(str2)) 
			System.out.println("�� ���ڿ��� �����ϴ�.");
		
		else 
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		
		cmp = str1.compareTo(str2);
		
		if(cmp == 0) 
			System.out.println("�� ���ڿ��� ��ġ�մϴ�.");
		
		else if(cmp<0) 
			System.out.println("������ �տ� ��ġ�ϴ� ����: "+str1);
		
		else 
			System.out.println("������ �տ� ��ġ�ϴ� ����: "+str2);
		
		if(str1.compareToIgnoreCase(str2)==0) 
			System.out.println("�� ���ڿ��� �����ϴ�.");
		
		else 
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		
	}
}
