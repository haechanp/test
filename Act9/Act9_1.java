package Act9;
import javax.swing.JFrame;

class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Let's study Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 200);
        setVisible(true);
    }
}

public class Act9_1 {

    public static void main(String[] args) {
        new MyFrame();
    }
}

