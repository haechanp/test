package Act8_1;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class Act8_11 {

    public static void main(String[] args) {
        FileReader fileReader = null;
        Vector<String> vector;
        Scanner scanner;

        try {
            // 현재 프로젝트 폴더를 기준으로 "words.txt" 파일 위치를 지정
            fileReader = new FileReader(new File("words.txt"));
            vector = new Vector<>();
            scanner = new Scanner(fileReader);
            String word = "";

            while (scanner.hasNext()) {
                word = scanner.next();
                vector.add(word);
            }

            System.out.println("프로젝트 폴더 밑의 words.txt 파일을 읽었습니다...");

            scanner.close();
            scanner = new Scanner(System.in);

            while (true) {
                boolean find = false;

                System.out.print("단어>>");
                word = scanner.next();

                if (word.equals("그만"))
                    break;

                for (int i = 0; i < vector.size(); i++) {
                    String w = vector.get(i);

                    if (w.length() < word.length())
                        continue;

                    String sub = w.substring(0, word.length());

                    if (sub.equals(word)) {
                        System.out.println(w);
                        find = true;
                    }
                }

                if (!find)
                    System.out.println("발견할 수 없음.");
            }

            System.out.println("종료합니다...");
            scanner.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


