import java.io.*;
public class Method2Param {
	public static void main(String[] args) {
		double myHeight=180.8;
		hiEveryone(12,188.8);
		hiEveryone(13,myHeight);
		byEveryone();
	}
	
	public static void hiEveryone(int age,double height) {
		System.out.println("�� ���̴�"+age+"�� �Դϴ�.");
		System.out.println("�� Ű��"+height+"�Դϴ�.");
	}
	public static void byEveryone() {
		System.out.println("������ �˰ڽ��ϴ�.");
	}

}
