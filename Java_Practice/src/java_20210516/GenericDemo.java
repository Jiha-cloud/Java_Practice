package java_20210516;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		// ArrayList list = new ArrayList(); 데이터의 안정성이 없다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");

		for (int i = 0; i < list.size(); i++) {
			String value = (String) list.get(i); // generic을 안 했을때는 Casting 해줘야한다.
			System.out.println(value);
		}

		for (String value : list) { // generic을 했기 때문에 inhanced if문을 사용할 수 있다.
			System.out.println(value);
		}
	}
}
