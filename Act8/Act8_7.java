package Act8_1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Act8_7 {

    public static void main(String[] args) {
        File sourceFile, destinationFile;
        FileInputStream fin;
        FileOutputStream fout;
        long n, total;
        try {
            sourceFile = new File("temp/red.png");
            destinationFile = new File("temp/copy.png");

            System.out.println(sourceFile.getName() + "를 " + destinationFile.getName() + "로 복사합니다.");
            System.out.println("10%마다 *를 출력합니다.");
            fin = new FileInputStream(sourceFile);
            fout = new FileOutputStream(destinationFile);

            int c;
            n = 0;
            total = sourceFile.length();

            while ((c = fin.read()) != -1) {
                fout.write((byte) c);
                n = (n + 1);
                if (n == total / 10) {
                    System.out.print("*");
                    n = 0;
                }
            }
            System.out.println("\n복사가 완료되었습니다.");
            fin.close();
            fout.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
