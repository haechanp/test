package Act9;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Act9_6 extends JFrame {
    public Act9_6() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        for (int i = 0; i < 20; i++) {
            int x = (int)(Math.random() * 200) + 50;
            int y = (int)(Math.random() * 200) + 50;
            JLabel label = new JLabel(" ");
            label.setBounds(x, y, 10, 10);
            label.setOpaque(true);
            label.setBackground(Color.blue);
            c.add(label);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Act9_6();
    }
}
