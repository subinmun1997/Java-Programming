import java.time.LocalTime;
import java.time.Duration;

class LocalTimeDemo2 {
	public static void main(String[] args) {
		LocalTime start = LocalTime.of(14,24,35);
		System.out.println("PC �̿� ���� �ð� : " + start);
		
		LocalTime end = LocalTime.of(17,31,19);
		System.out.println("PC �̿� ���� �ð� : " + end);
		
		Duration between = Duration.between(start, end);
		System.out.println("�� PC �̿� �ð�: " + between);
	}
}
