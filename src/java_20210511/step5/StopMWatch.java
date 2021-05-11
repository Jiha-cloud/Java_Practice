package java_20210511.step5;

public class StopMWatch extends StopWatch {
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	public double getElaspsedTime() {
		return (double) (endTime - startTime) / 1000;
	}
	public void execute() {
		start();
		for (int i = 0; i < 300_000_000l; i++) {

		}
		stop();
		double elapsedTime = getElaspsedTime();
		System.out.printf("����ð� : %,.3f \n", elapsedTime);
	}
}
