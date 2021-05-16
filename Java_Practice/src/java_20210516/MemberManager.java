package java_20210516;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberManager {
	private ArrayList list;
	
	public void check(ArrayList list2) {
		for (int i = 0; i < list2.size(); i++) {
			Member m = (Member)list.get(i);
			System.out.printf("%s %s %d \n",m.getId(),m.getName(),m.getAge());
		}
		System.out.printf("\n 회원 수는 %d명입니다. \n", list2.size());
		System.out.println("============================================");
	}
	public MemberManager() {
		list = new ArrayList();
	}
	
	public void insert(String id, String name, int age) {
		list.add(new Member(id, name, age));
	}
	
	public void update(String id, String name, int age) {
		for (int i = 0; i < list.size(); i++) {
			Member m = (Member) list.get(i);
			if (id.equals(m.getId())) {
				list.remove(i);
				break;
			}
		}
		list.add(new Member(id, name, age));
	}
	public void delete(String id) {
		for (int i = 0; i < list.size(); i++) {
			Member m = (Member) list.get(i);
			if(id.equals(m.getId())){
				list.remove(i);
				break;
			}
		}
	}
	public ArrayList select() {
		return list;
	}
	
	public Member select(String id) {
		Member member = null;
		for (int i = 0; i < list.size(); i++) {
			Member m = (Member) list.get(i);
			if(id.equals(m.getId())) {
				member = m;
				break;
			}	
		}
		return member;
	}
}
