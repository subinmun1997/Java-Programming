import java.util.function.BiConsumer;

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BiPredicate {
	public static void main(String[] args) {
		BiConsumer<Box<Integer>,Integer> c1 = (b,i) -> b.set(i);
		BiConsumer<Box<Double>, Double> c2 = (b,i) -> b.set(i);
		
		Box<Integer> bi = new Box<>();
		Box<Double> bd = new Box<>();
		
		c1.accept(bi, 10);
		c2.accept(bd, 5.2);
		
		System.out.println(bi.get());
		System.out.println(bd.get());
		
	}
}
