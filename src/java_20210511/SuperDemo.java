package java_20210511;

class A {
};

class B extends A {
};

class A1 {
	int a;

	A1(int a) {
		this.a = a;
	}
}

class B1 extends A1 {
	B1() {
		super(10); // �θ�Ŭ�������� int���� �޴� �����ڸ� ȣ���ϴ°�
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		B1 b = new B1();
		System.out.println(b.a);
	}
}
