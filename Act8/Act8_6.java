package Act8_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Act8_6 {

    public static void main(String[] args) {
        FileInputStream f1 = null, f2 = null;
        FileOutputStream f3 = null;
        String s1, s2;
        Scanner sc = new Scanner(System.in);

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        s1 = sc.next();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        s2 = sc.next();

        try {
            f1 = new FileInputStream(new File(s1));
            f2 = new FileInputStream(new File(s2));
            f3 = new FileOutputStream(new File("appended.txt"));

            byte buff[] = new byte[1024];
            int n;

            while ((n = f1.read(buff)) != -1) {
                f3.write(buff, 0, n);
            }

            while ((n = f2.read(buff)) != -1) {
                f3.write(buff, 0, n);
            }

            System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (f1 != null) {
                    f1.close();
                }
                if (f2 != null) {
                    f2.close();
                }
                if (f3 != null) {
                    f3.close();
                }
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

