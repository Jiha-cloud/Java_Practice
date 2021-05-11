package java_20210511.step1;

public class FootStopWatch {
	long startTime;
	long endTime;

	public double getElaspsedTime() {
		return (double) (endTime - startTime) / 1000;
	}

	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		// 1970�� 1�� 1�Ϻ��� ��������� �ð��� �и�������� ��ȯ
		f.startTime = System.currentTimeMillis();

		for (int i = 0; i < 300_000_000l; i++) {

		}

		f.endTime = System.currentTimeMillis();
		double elapsedTime = f.getElaspsedTime();
		System.out.printf("����ð� : %,.3f \n", elapsedTime);
	}
}
