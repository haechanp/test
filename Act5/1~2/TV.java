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

class IPTV extends ColorTV {
    private String ipAddress;

    public IPTV(String ip, int size, int colorSize) {
        super(size, colorSize);
        ipAddress = ip;
    }

    @Override
    public void printProperty() {
        System.out.print("나의 IPTV는 " + ipAddress + " 주소의 ");
        super.printProperty();
    }
}

public class p0502 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}

