package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int k, int e) {
		int sum = k + e;
		double avg = (double) sum/2;
		return avg;
	}
	
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
			
			double average = getAvgs(korean, english);
			System.out.printf("국어와 영어의 평균 점수는 %.1f \n",average);
		}catch (NumberFormatException e) {
			System.err.println(e.getMessage());
			System.err.println("숫자 인자가 필요합니다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			System.err.println("인자 2개가 필요합니다.");
		}finally {
			System.out.println("무조건 수행되는 블럭 - finally");
		}
	}
}
