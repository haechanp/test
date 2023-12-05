package Act9;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame {
    public MyFrame1() {
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout(5, 7));
        container.add(new JButton("North"), BorderLayout.NORTH);
        container.add(new JButton("West"), BorderLayout.WEST);
        container.add(new JButton("Center"), BorderLayout.CENTER);
        container.add(new JButton("East"), BorderLayout.EAST);
        container.add(new JButton("South"), BorderLayout.SOUTH);

        setSize(300, 200);
        setVisible(true);
    }
}

public class Act9_2 {
    public static void main(String[] args) {
        new MyFrame1();
    }
}


