import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class StrComp implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
}

class StringComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("APPLE");
		list.add("BOX");
		
		StrComp cmp = new StrComp();
		Collections.sort(list,cmp);
		int idx = Collections.binarySearch(list, "ROBOT",cmp);
		System.out.println(list.get(idx));
	}
}
