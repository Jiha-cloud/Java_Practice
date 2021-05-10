package java_20210509;

public class MethodDemo {
	public int plus(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		int sum = m.plus(10, 20);
		System.out.println(sum);
		System.out.printf("%d\n",sum);
		
		Calendar calendar = new Calendar();
		boolean leafYear = calendar.isLeafYear(2100);
		System.out.printf("%s\n",leafYear);
		
		int[] test = {10, 100, 30, 45, 70, 32, 55, 12, 99};
		Ascending asc = new Ascending();
		Descending desc = new Descending();
		int[] testAscending = asc.ascending(test);
		for (int i = 0; i < testAscending.length; i++) {
			System.out.printf("%d \t",testAscending );
		}
		
		int[] testDescending = desc.descending(test);
		System.out.println();
		for (int i = 0; i < testDescending.length; i++) {
			System.out.printf("%d \t", testDescending);
		}
		System.out.println();
		System.out.println();
	}

}
