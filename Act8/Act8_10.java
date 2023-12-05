package Act8_1;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Act8_10 {

    public static void main(String[] args) {
        File file = null;
        FileReader fileReader = null;
        HashMap<String, String> phone;
        Scanner scanner;

        try {
            phone = new HashMap<>();
            file = new File("c:\\temp1\\phone.txt");
            fileReader = new FileReader(file);
            scanner = new Scanner(fileReader);

            while (scanner.hasNext()) {
                String name = scanner.next();
                String tel = scanner.next();
                phone.put(name, tel);
                System.out.println("key:" + name + " value:" + phone.get(name));
            }

            System.out.println("총 " + phone.size() + "개의 정보를 읽었습니다.");
            scanner.close();
            scanner = new Scanner(System.in);
            String temp = "";

            while (true) {
                System.out.print("이름>>");
                temp = scanner.next();
                System.out.println(temp);

                if (temp.equals("그만")) {
                    break;
                }

                String phoneNumber = phone.get(temp);

                if (phoneNumber == null) {
                    System.out.println("찾는 이름이 없습니다.");
                } else {
                    System.out.println(phoneNumber);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
