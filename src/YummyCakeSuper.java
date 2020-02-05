class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		super.yummy();
		System.out.println("Yummy CheeseCake");
	}
	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}

class YummyCakeSuper { 
	public static void main(String[] args) {
		CheeseCake c1 = new CheeseCake();
		c1.yummy();
		c1.tasty();
	}

}
