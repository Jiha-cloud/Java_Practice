package java_20210510;

public class MemberPayDemo {
	public static void main(String[] args) {
		MemberPay m = new MemberPay();
		m.setSeq(1);
		m.setName("�ڹ� �����ϸ��� �ϼ��ϱ�");
		m.setGroup(1);
		m.setPrice(500_000);
		m.isValid(true);
		m.setSdate("2021-05-10");
		m.setEdate("2021-12-31");
		m.setRegdate("2021-05-10");
		
		System.out.println(m.getSeq());
		System.out.println(m.getGroup());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
		System.out.println(m.getStatus());
		System.out.println(m.getValid());
		System.out.println(m.getSdate());
		System.out.println(m.getEdate());
		System.out.println(m.getRegdate());
	}

}
