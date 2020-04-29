import java.util.Scanner;
import java.io.*;

class BytesFileCopier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ����: ");
		String src = sc.nextLine();
		
		System.out.println("�纻 �̸�: ");
		String dst = sc.nextLine();
		
		try(InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
			int data;
			while(true) {
				data = in.read();
				if(data == -1)
					break;
				out.write(data);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
