package Act8_1;
import java.io.*;
import java.util.Scanner;

public class Stop {
	public static void main(String[] args) {
		System.out.println("전화번호 입력 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		String name, phoneNumber;
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("c:\\Temp\\phone.txt");
			while(true) {
				name = sc.next();
				if(name.equals("그만")) break;
				phoneNumber = sc.next();
				
				fout.write(name);
				fout.write(" " + phoneNumber);
				fout.write("\r\n");
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		sc.close();
	}
}