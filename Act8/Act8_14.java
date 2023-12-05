package Act8_1;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Act8_14 {

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
                String line = scanner.nextLine();
                StringTokenizer st = new StringTokenizer(line, " ");
                String operation = st.nextToken();

                if (operation.equals("그만"))
                    break;

                if (operation.equals("..")) {
                    if (currentDirectory.getParent() == null) {
                        continue;
                    } else {
                        currentDirectory = new File(currentDirectory.getParent());
                    }
                } else {
                    if (operation.equals("rename")) {
                        try {
                            String oldName = st.nextToken();
                            String newName = st.nextToken();
                            File oldFile = new File(currentDirectory, oldName);
                            File newFile = new File(currentDirectory, newName);

                            if (newFile.exists()) {
                                System.out.println("이미 존재하는 파일이나 디렉터리 이름입니다.");
                            } else {
                                oldFile.renameTo(newFile);
                            }

                        } catch (Exception e) {
                            System.out.println("두 개의 파일명이 주어지지 않았습니다.");
                        }
                    } else if (operation.equals("mkdir")) {
                        try {
                            String dirName = st.nextToken();
                            File newDir = new File(currentDirectory, dirName);

                            if (newDir.exists()) {
                                System.out.println("이미 존재하는 파일이나 디렉토리입니다.");
                            } else {
                                System.out.println(dirName + " 디렉터리를 생성하였습니다.");
                                newDir.mkdir();
                            }
                        } catch (Exception e) {
                            System.out.println("생성할 디렉토리 명이 주어지지 않았습니다.");
                        }
                    } else {
                        if (new File(currentDirectory, operation).isDirectory()) {
                            currentDirectory = new File(currentDirectory, operation);
                        } else {
                            System.out.println("디렉토리가 아닙니다.");
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
