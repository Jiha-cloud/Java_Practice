package java_20210511;

public class Child extends Parent {
	String phone;
	String weight;
	String height;

	public Child(String name, String address, int age, String phone, String weight, String height) {
		super(name, address, age);
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}

	public Child(String phone, String weight, String height) {
		super();
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}

}
