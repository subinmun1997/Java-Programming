import java.io.*;
public class Method2Param {
	public static void main(String[] args) {
		double myHeight=180.8;
		hiEveryone(12,188.8);
		hiEveryone(13,myHeight);
		byEveryone();
	}
	
	public static void hiEveryone(int age,double height) {
		System.out.println("제 나이는"+age+"세 입니다.");
		System.out.println("제 키는"+height+"입니다.");
	}
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

}
