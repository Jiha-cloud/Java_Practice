package java_20210511;

public class Sub extends Super {
	String chicken;
	
	public void goToSchool() {
		System.out.println("Sub goToSchool() ȣ��");
	}
	
	// overiding : �θ��� �޼��带 �ڽ� Ŭ�������� �������ϴ°�
	// �ۼ���Ģ
	// 1. ��ȯ��, �޼��� �̸�, �Ű����� ��ġ
	// 2. ���� �����ڴ� �θ𺸴� �ڽ��� �����̰ų� ��ġ e.g. �θ� protected / �ڽ� protected or public
	public void play(String starcraft) {
		System.out.println("sub play(~) ȣ��");
	}
	public String toString() {
		return "�����ǵǾ����ϴ�";
	}

}
