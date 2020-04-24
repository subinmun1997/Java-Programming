import java.util.List;
import java.util.Arrays;

class Box<T> {
	private T ob;
	public Box(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxToInteger {
	public static void main(String[] args) {
		List<Box<String>> ls = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
		ls.stream()
		  .mapToInt(s -> s.get().length())
		  .forEach(s -> System.out.println(s));
	}
}