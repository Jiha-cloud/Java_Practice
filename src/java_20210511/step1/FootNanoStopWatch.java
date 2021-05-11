package java_20210511.step1;

public class FootNanoStopWatch {
	long startTime;
	long endTime;

	public double getElaspsedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}

	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		f.startTime = System.nanoTime();
		for (int i = 0; i < 300_000_000l; i++) {

		}
		f.endTime = System.nanoTime();
		double elapsedTime = f.getElaspsedTime();
		System.out.printf("����ð� : %,.9f \n", elapsedTime);
	}
}
