package java_20210509;

public class OverloadingDemo {
	public void print(String str) {
		System.out.println(str);
	}
	public void print(int i) {
		System.out.println(i);
	}
	public void print(double d) {
		System.out.println(d);
	}
	public void print(boolean b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		OverloadingDemo demo = new OverloadingDemo();
		demo.print("¹ÚÁöÇÏ");
		demo.print(10);
		demo.print(true);
		demo.print(42.34);
	}

}
