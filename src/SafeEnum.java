enum Animal{
	DOG,CAT
}
enum Person{
	MAN, WOMAN
}

class SafeEnum {
	public static void main(String[] args) {
		who(Person.MAN);
		//who(Animal.DOG); �ּ� �����ϸ� compile Error
	}
	public static void who(Person man) {
		switch(man) {
		case MAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		case WOMAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		}
	}
}
