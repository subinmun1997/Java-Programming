class Box<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class TargetTypesEx {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		iBox.set(25);
		System.out.println(iBox.get());
		
	}
}
