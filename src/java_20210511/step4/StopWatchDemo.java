package java_20210511.step4;

public class StopWatchDemo {
	public static void run(StopNWatch s) {

		s.start();
		for (int i = 0; i < 3_000_000_000l; i++) {

		}
		s.stop();
		double elapsedTime = s.getElaspsedNTime();
		System.out.printf("°æ°ú½Ã°£ : %,.9f \n", elapsedTime); // 3ÀÌ¶û 9 ¹Ù²ãÁà¾ßµÊ
	}

	public static void run(StopMWatch s) {

		s.start();
		for (int i = 0; i < 300_000_000l; i++) {

		}
		s.stop();
		double elapsedTime = s.getElaspsedTime();
		System.out.printf("°æ°ú½Ã°£ : %,.3f \n", elapsedTime); // 3ÀÌ¶û 9 ¹Ù²ãÁà¾ßµÊ
	}

	public static void main(String[] args) {
		StopMWatch s = new StopMWatch();
		run(s);
	}
}
