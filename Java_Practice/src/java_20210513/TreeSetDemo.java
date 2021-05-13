package java_20210513;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		// TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고,
		// natural ordering(숫자일 때와 문자일 때 정렬방식이 다르다)를 한다.
		
		TreeSet set = new TreeSet();
		set.add(1);
		set.add(30);
		set.add(45);
		set.add(75);
		set.add(34);
		set.add(5);
		set.add(99);
		set.add(121);
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			int temp = (int) i.next();
			System.out.println(temp);
		}
	}
}
