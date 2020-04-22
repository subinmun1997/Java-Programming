import java.util.Arrays;
import java.util.stream.Stream;

class StringStream {
	public static void main(String[] args) {
		String[] names = {"YOON", "LEE", "PARK"};
		Stream<String> stm = Arrays.stream(names);
		stm.forEach(s -> System.out.println(s));
	}
}
