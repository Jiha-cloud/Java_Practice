package java_20210511.step3;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopMWatch s = new StopMWatch();
		s.start();
		for (int i = 0; i < 300_000_000l; i++) {

		}
		s.stop();
		double elapsedTime = s.getElaspsedTime();
		System.out.printf("����ð� : %,.3f \n", elapsedTime); // 3�̶� 9 �ٲ���ߵ�
	}
}
