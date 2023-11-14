class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV extends TV {
    private int colorSize;

    public ColorTV(int size, int colorSize) {
        super(size);
        this.colorSize = colorSize;
    }

    public void printProperty() {
        System.out.println(getSize() + "인치 " + colorSize + "컬러");
    }
}

public class p0501 {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
} 
1번 문제의 해결 코드입니다 같은 클래스 명으로 두 파일을 올릴 수 없어 따로 업로드합니다
