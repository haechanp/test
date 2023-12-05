package Act8_1;
import java.io.File;

public class Act8_9 {

    public static void main(String[] args) {
        File directory;
        File[] files;

        try {
            directory = new File("c:\\temp1\\");
            files = directory.listFiles();

            int cnt = 0;

            if (files != null && files.length > 0) {
                System.out.println(directory.getPath() + " 디렉토리의 .txt 파일을 모두 삭제합니다.");

                for (File file : files) {
                    if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                        System.out.println(file.getName() + " 삭제");
                        if (file.delete()) {
                            cnt++;
                        } else {
                            System.out.println("파일 삭제에 실패했습니다: " + file.getName());
                        }
                    }
                }

                System.out.println("총 " + cnt + "개의 .txt 파일을 삭제했습니다.");
            } else {
                System.out.println("디렉토리에 파일이 없거나 디렉토리 자체가 없습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
