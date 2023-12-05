package Act9;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
    public MyFrame2() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new GridLayout(1, 10));

        JButton btn[] = new JButton[10];

        for (int i = 0; i < 10; i++) {
            btn[i] = new JButton(Integer.toString(i));
            container.add(btn[i]);
        }

        setSize(500, 200);
        setVisible(true);
    }
}

public class Act9_3 {
    public static void main(String[] args) {
        new MyFrame2();
    }
}
