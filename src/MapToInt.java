import java.util.List;
import java.util.Arrays;

class MapToInt {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box","Robot","Simple");
		
		ls.stream()
		  .map(s -> s.length())
		  .forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}
}
