import java.time.LocalTime;

class LocalTimeDemo1 {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("���� �ð�: " + now);
		
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);
		
		System.out.println("ȭ�� ���� �ð� : " + mt);
	}
}
