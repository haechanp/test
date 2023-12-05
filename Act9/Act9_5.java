package Act9;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Act9_5 extends JFrame {
    public Act9_5() {
        Color colors[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA};
        System.out.println(colors.length);
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 16; i++) {
            JLabel label = new JLabel(Integer.toString(i));
            label.setBackground(colors[i]);
            label.setOpaque(true);
            container.add(label);
        }

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Act9_5();
    }
}



