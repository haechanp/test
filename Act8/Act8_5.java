package Act8_1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Act8_5 {

    public static boolean com(FileInputStream f1, FileInputStream f2) throws IOException {
        byte[] buf1 = new byte[1024];
        byte[] buf2 = new byte[1024];

        int l1, l2;

        while (true) {
            l1 = f1.read(buf1, 0, buf1.length);
            l2 = f2.read(buf2, 0, buf2.length);

            if (l1 != l2) {
                return false;
            }

            if (l1 == -1) {
                break;
            }

            for (int i = 0; i < l1; i++) {
                if (buf1[i] != buf2[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        FileInputStream f1 = null;
        FileInputStream f2 = null;
        String s1, s2;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
            System.out.print("첫번째 파일 이름을 입력하세요>>");
            s1 = sc.next();
            System.out.print("두번째 파일 이름을 입력하세요>>");
            s2 = sc.next();

            f1 = new FileInputStream(s1);
            f2 = new FileInputStream(s2);

            if (!com(f1, f2)) {
                System.out.println("파일이 서로 다릅니다.");
            } else {
                System.out.println("파일이 같습니다.");
            }
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
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
