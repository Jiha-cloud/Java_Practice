package java_20210516;

import java.util.ArrayList;

class Product {
	private int number;
	private String name;
	private double price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class ListDemo {
	public static Product selectByNumber() {
		return new Product(1, "신발", 100_000);
	}

	public static ArrayList select() {
		ArrayList list = new ArrayList();

		list.add(new Product(2,"라면",1000));
		list.add(new Product(3,"계란",3000));
		list.add(new Product(4,"우유",1500));
		list.add(new Product(5,"요플레",2000));
		
		return list;
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("111");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String) list.get(i); // get()이 object로 반환하기 때문에 원하는 type로 casting 해줘야됨.
			System.out.println(temp);
		}
		
		Product pro = selectByNumber(); // Product 객체를 하나 만들어서 넘겨줌
		System.out.printf("%d번 제품명 : %s 가격 : %,.2f원 \n", pro.getNumber(), pro.getName(), pro.getPrice());
		
		ArrayList proList = select();
		for (int i = 0; i < proList.size(); i++) {
			Product p = (Product) proList.get(i);
			System.out.printf("%d번 제품명 : %s 가격 : %,.2f원 \n", p.getNumber(), p.getName(), p.getPrice());
		}
	}
	}

