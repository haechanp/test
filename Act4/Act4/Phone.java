package Act4;
import java.util.Scanner;

class Phone{
    String name;
    String tel;
    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}
public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>> ");
        int person = sc.nextInt();
        Phone [] phones = new Phone[person];
        for(int i = 0; i<phones.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
            String name = sc.next();
            String tel = sc.next();
            phones[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");
        
        while(true) {
            int i = 0;
            System.out.print("검색할 이름>> ");
            String search = sc.next();
            
            for(i =0; i<phones.length; i++) {
                if(search.equals(phones[i].name)) {
                    System.out.println(search+"의 번호는 "+phones[i].tel+"입니다.");
                    break;
                }
            }
            if(search.equals("그만")) break;
            if(i == person) {
                System.out.println(search+" 이 없습니다.");
            }
        }        
        sc.close();
    }
}