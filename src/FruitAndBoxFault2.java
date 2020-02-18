class Apple{
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	public String toString() {
		return "I an an orange.";
	}
}

class Box{
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	public Object get() {
		return ob;
	}
}

class FruitAndBoxFault2 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set("Apple");
		oBox.set("Orange");
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}
}
