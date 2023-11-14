package Act5;

abstract class PairMap {
    protected String keyArray[];
    protected String valueArray[];

    abstract String get(String key);

    abstract void put(String key, String value);

    abstract String delete(String key);

    abstract int length();
}

class Dictionary extends PairMap {
    private int num;

    public Dictionary(int n) {
        num = 0;
        keyArray = new String[n];
        valueArray = new String[n];
    }

    String get(String key) {
        for (int i = 0; i < num; i++) {
            if (keyArray[i].equals(key)) {
                return valueArray[i];
            }
        }
        return null;
    }

    void put(String key, String value) {
        for (int i = 0; i < num; i++) {
            if (keyArray[i].equals(key)) {
                valueArray[i] = value;
                return;
            }
        }
        valueArray[num] = value;
        keyArray[num] = key;
        num++;
        return;
    }

    String delete(String key) {
        String deleteData = null;
        for (int i = 0; i < num; i++) {
            if (keyArray[i].equals(key)) {
                deleteData = valueArray[i];
                for (int j = i; j < num - 1; j++) {
                    valueArray[j] = valueArray[j + 1];
                    keyArray[j] = keyArray[j + 1];
                }
                num--;
            }
        }
        return deleteData;
    }

    int length() {
        return num;
    }
}

public class p0510 {

    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }

}
