interface Eatable{
	public String eat();
}

class Apple implements Eatable{
	public String toStinrg() {
		return "I am an apple.";
	}
	@Override
	public String eat() {
		return "It tastes so good!";
	}
}

class Box<T extends Eatable>{
	T ob;
	
	public void set(T o) {
		ob = o;
	}
	public  T get() {
		System.out.println(ob.eat());
		return ob;
	}
}

class BoundedInterfaceBox {
	public static void main(String[] args) {
		Box<Apple> box = new Box<>();
		box.set(new Apple());
		
		Apple ap = box.get();
		System.out.println(ap);
	}
}
