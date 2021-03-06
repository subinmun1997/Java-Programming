import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class CopyList {
	public static void main(String[] args) {
		List<String> src = Arrays.asList("BOX","APPLE","TOY","ROBOT");
		
		List<String> dest = new ArrayList<>(src);
		
		Collections.sort(dest);
		System.out.println(dest);
		
		Collections.copy(dest,src);
		System.out.println(dest);
	}
}
