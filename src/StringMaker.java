import java.util.function.Function;

class StringMaker {
	public static void main(String[] args) {
		Function<char[],String> f = ar -> new String(ar);
		char[] src = {'R','o','b','o','t'};
		String str = f.apply(src);
		System.out.println(str);
	}
}
