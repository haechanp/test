package Act8_1;
import java.io.File;
import java.util.Scanner;

public class Act8_13 {

    public static void main(String[] args) {
        File currentDirectory = null;
        File[] fileList;
        Scanner scanner;

        try {
            scanner = new Scanner(System.in);
            currentDirectory = new File("c:\\");

            System.out.println("***** 파일 탐색기입니다. *****");

            while (true) {
                String nowDirectory = currentDirectory.getName();
                System.out.println("[" + nowDirectory + "]");
                fileList = currentDirectory.listFiles();

                for (int i = 0; i < fileList.length; i++) {
                    String type = fileList[i].isDirectory() ? "dir" : "file";
                    System.out.println(type + "\t" + fileList[i].length() + "바이트\t" + fileList[i].getName());
                }

                System.out.print(">>");
                String operation = scanner.next();

                if (operation.equals("그만"))
                    break;

                if (operation.equals("..")) {
                    if (currentDirectory.getParent() == null) {
                        continue;
                    } else {
                        currentDirectory = new File(currentDirectory.getParent());
                    }
                } else {
                    if (new File(currentDirectory, operation).isDirectory()) {
                        currentDirectory = new File(currentDirectory, operation);
                    } else {
                        System.out.println("디렉토리가 아닙니다.");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
