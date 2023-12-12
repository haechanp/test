파일 누락 업로딩 오류로인한 13일 아침 파일 수정

1번

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Chapter10 extends JFrame {
    Chapter10(){
        setTitle("CheckBox Practice");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox disableButton = new JCheckBox("버튼 비활성화");
        JCheckBox hideButton = new JCheckBox("버튼 감추기");
        JButton btn = new JButton("test Button");
        c.add(disableButton);
        c.add(hideButton);
        c.add(btn);
        disableButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED) {
                    btn.setEnabled(false);
                }
                else {
                    btn.setEnabled(true);
                }
            }
        });
        hideButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED) {
                    btn.setVisible(false);
                }
                else {
                    btn.setVisible(true);
                }
            }
        });
        setSize(300, 200);
        setVisible(true);
    }


    public static void main(String args[]){
        new Chapter10();
    }
}

2번

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Chapter10 extends JFrame {
    Chapter10(){
        setTitle("JTextField and JComponent");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextField textField = new JTextField(10);
        JComboBox<String> comboBox = new JComboBox<>();

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox.addItem(textField.getText());
                textField.setText("");
            }
        });

        c.add(textField);
        c.add(comboBox);

        setSize(300, 200);
        setVisible(true);
    }


    public static void main(String args[]){
        new Chapter10();
    }
}

3번

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter10 extends JFrame {
    Chapter10(){
        JTextField textField = new JTextField(10);
        JTextField result[] = new JTextField[8];
        JButton btn = new JButton("계산");
        JLabel money[] = new JLabel[8];
        String[] str = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
        int[] won = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        setTitle("Money Charger");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel mPanel = new JPanel();
        mPanel.setLayout(new FlowLayout());
        mPanel.add(new JLabel("금액"));
        mPanel.add(textField);
        mPanel.add(btn);
        mPanel.setBackground(Color.pink);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = Integer.parseInt(textField.getText());
                for(int i = 0; i < 7; i++) {
                    result[i].setText(Integer.toString(total/won[i]));
                    total %= won[i];
                }
            }
        });

        JPanel sPanel = new JPanel();
        sPanel.setLayout(new GridLayout(8, 2));
        sPanel.setBackground(Color.PINK);
        for(int i = 0; i < 8; i++){
            money[i] = new JLabel(str[i]);
            result[i] = new JTextField();
            sPanel.add(money[i]);
            sPanel.add(result[i]);
        }


        setSize(300, 400);
        c.add(sPanel, BorderLayout.CENTER);
        c.add(mPanel, BorderLayout.NORTH);
        setVisible(true);
    }


    public static void main(String args[]){
        new Chapter10();
    }
}

4번

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter10 extends JFrame {
    Chapter10(){
        JTextField textField = new JTextField(10);
        JTextField result[] = new JTextField[8];
        JButton btn = new JButton("계산");
        JLabel money[] = new JLabel[8];
        JCheckBox check[]=new JCheckBox[7];
        String[] str = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
        int[] won = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        setTitle("Money Charger");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel mPanel = new JPanel();
        mPanel.setLayout(new FlowLayout());
        mPanel.add(new JLabel("금액"));
        mPanel.add(textField);
        mPanel.add(btn);
        mPanel.setBackground(Color.pink);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = Integer.parseInt(textField.getText());
                for(int i = 0; i < 8; i++) {
                    if(i == 7){
                        result[i].setText(Integer.toString(total));
                        return;
                    }
                    if(check[i].isSelected()){
                        result[i].setText(Integer.toString(total/won[i]));
                        total %= won[i];
                    }
                    else{
                        result[i].setText("0");
                    }

                }
            }
        });

        JPanel sPanel = new JPanel();
        sPanel.setLayout(new GridLayout(8, 2));
        sPanel.setBackground(Color.PINK);
        for(int i = 0; i < 8; i++){
            money[i] = new JLabel(str[i]);
            result[i] = new JTextField();
            sPanel.add(money[i]);
            sPanel.add(result[i]);
            if(i<7) {
                check[i]=new JCheckBox();
                check[i].setBackground(Color.pink);
                sPanel.add(check[i]);
            }
        }


        setSize(300, 400);
        c.add(sPanel, BorderLayout.CENTER);
        c.add(mPanel, BorderLayout.NORTH);
        setVisible(true);
    }


    public static void main(String args[]){
        new Chapter10();
    }
}


5번

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter10 extends JFrame {
    Chapter10(){
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JSlider slider = new JSlider(100, 200, 120); // min. max. init value
        JLabel label = new JLabel("120");
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider temp = (JSlider) e.getSource();
                label.setText(Integer.toString(temp.getValue()));
            }
        });
        c.add(slider);
        c.add(label);

        setSize(300, 200);
        setVisible(true);
    }


    public static void main(String args[]){
        new Chapter10();
    }
}

5번

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter10 extends JFrame {
    Chapter10(){
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JSlider slider = new JSlider(100, 200, 120); // min. max. init value
        JLabel label = new JLabel("120");
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider temp = (JSlider) e.getSource();
                label.setText(Integer.toString(temp.getValue()));
            }
        });
        c.add(slider);
        c.add(label);

        setSize(300, 200);
        setVisible(true);
    }


    public static void main(String args[]){
        new Chapter10();
    }
}

7번

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Chapter10 extends JFrame {
    Chapter10(){
        JSlider slider = new JSlider(0, 100, 0); // min. max. init value
        JLabel label = new JLabel("I Love Java");
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,1));
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);


        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider temp = (JSlider) e.getSource();
                label.setFont(new Font("Arial", Font.PLAIN, temp.getValue()));
            }
        });

        c.add(slider, BorderLayout.NORTH);
        c.add(label, BorderLayout.CENTER);

        setSize(500, 500);
        setVisible(true);
    }


    public static void main(String args[]){
        new Chapter10();
    }
}


8번

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chapter11 extends JFrame {
    JRadioButton radioButtons[] = new JRadioButton[2];
    ImageIcon imageIcons[] = {new ImageIcon("images/Facebook.png"), new ImageIcon("images/google.png"), new ImageIcon("images/naver.png")};
    JLabel imageLabel = new JLabel(imageIcons[0]);
    int selectIndex = 0;
    Chapter11(){

        setTitle("Image Gallary Practice Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());

        radioButtons[0] = new JRadioButton("left");
        radioButtons[0].setSelected(true);
        radioButtons[1] = new JRadioButton("Right");

        top.add(radioButtons[0]);
        top.add(radioButtons[1]);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButtons[0]);
        group.add(radioButtons[1]);

        c.add(top, BorderLayout.NORTH);
        c.add(imageLabel, BorderLayout.CENTER);

        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(radioButtons[0].isSelected()){
                    selectIndex++;
                    if(selectIndex > 2){
                        selectIndex = 0;
                    }
                }
                else{
                    selectIndex--;
                    if(selectIndex < 0){
                        selectIndex = imageIcons.length - 1;
                    }
                }
                imageLabel.setIcon(imageIcons[selectIndex]);

            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[]){
        new Chapter11();
    }
}

9번

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chapter11 extends JFrame {
    JButton btn[] = new JButton[3];
    ImageIcon imageIcons[] = {new ImageIcon("images/scissor.png"), new ImageIcon("images/rock.png"), new ImageIcon("images/paper.png")};
    JLabel userLabel = new JLabel("me");
    JLabel computerLabel = new JLabel("com");
    int user, computer;
    JLabel result = new JLabel();
    Chapter11(){

        setTitle("가위 바위 보 게임");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());

        for(int i = 0; i < 3; i++){
            btn[i] = new JButton(imageIcons[i]);
            btn[i].addActionListener(new game(i));
            top.add(btn[i]);
        }
        top.setBackground(Color.gray);
        c.add(top, BorderLayout.NORTH);

        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());
        center.add(userLabel);
        center.add(computerLabel);
        result.setForeground(Color.RED);
        center.add(result);
        center.setBackground(Color.YELLOW);
        c.add(center, BorderLayout.CENTER);

        setSize(1000,800);
        setVisible(true);
    }

    class game implements ActionListener{
        int index;
        game(int i){
            index = i;
        }
        public void actionPerformed(ActionEvent e){
            user = index;
            computer = (int)(Math.random()*3);
            userLabel.setIcon(imageIcons[user]);
            computerLabel.setIcon(imageIcons[computer]);

            if(user == computer){
                result.setText("SAME!!");
            }
            else if(user - computer == -2 || user - computer == 1){
                result.setText("ME !!");
            }else{
                result.setText("COM !!");
            }
        }
    }

    public static void main(String args[]){
        new Chapter11();
    }
}

10번

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chapter11 extends JFrame {
    int count = 0;
    Chapter11(){
        setTitle("Ten 레이블 클릭");
        setDefaultCloseOperation(3);
        JLabel[] labels = new JLabel[10];
        JPanel panel = new JPanel();

        panel.setLayout(null);

        for(int i= 0; i <labels.length; i++)

        {

            int x = (int)(Math.random()*300);

            int y = (int)(Math.random()*300);

            labels[i] = new JLabel();

            labels[i].setText(Integer.toString(i));

            labels[i].setSize(15, 15);

            labels[i].setLocation(x, y);

            labels[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    JLabel temp = new JLabel();
                    temp = (JLabel) e.getSource();
                    if(Integer.parseInt(temp.getText()) <= Integer.parseInt(labels[count].getText())){
                        temp.setVisible(false);
                        count++;
                        if(Integer.parseInt(temp.getText()) == 9){
                            for(int i = 0; i< labels.length; i++){
                                int x = (int)(Math.random()*300);

                                int y = (int)(Math.random()*300);

                                labels[i].setLocation(x, y);

                                labels[i].setVisible(true);
                            }
                        }
                    }
                }
            });
            labels[i].setForeground(Color.MAGENTA);
            panel.add(labels[i]);
        }

        this.add(panel);

        setSize(350,350);
        setVisible(true);
    }


    public static void main(String args[]){
        new Chapter11();
    }
}


