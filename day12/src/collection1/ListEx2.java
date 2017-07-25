package collection1;

import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		list.add("second");
		list.add(5.0f);
	}
}
