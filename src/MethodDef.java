import java.io.*;
public class MethodDef {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hihelloEveryone(12);
		hihelloEveryone(13);
		System.out.println("프로그램의 끝");
	}
	
	public static void hihelloEveryone(int age) {
		System.out.println("하이 헬로우");
		System.out.println("제 나이는 "+age+"세 입니다.");
	}
}
