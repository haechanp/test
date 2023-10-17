package Act4;
import java.util.Scanner;

class Dictionary{
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        int i =0;
        for(i =0; i<kor.length; i++) {
            if(word.equals(kor[i])) {
                System.out.println(word+"은 "+eng[i]);
                break;
            }
        }
        if(i == kor.length) System.out.println(word+"는 저의 사전에 없습니다.");
        return null;
    }
}
public class DicApp {
    public static void main(String[] args) {
        System.out.println("한영 단어 검색 프로그램입니다.");
        Scanner sc = new Scanner(System.in);
        Dictionary dic = new Dictionary();
        
        while(true) {
            System.out.print("한글 단어?");
            String word = sc.next();
            if(word.equals("그만")) break;
            dic.kor2Eng(word);
        }
        
        sc.close();
    }
}