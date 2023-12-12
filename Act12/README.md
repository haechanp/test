13일 아침 파일 누락 확인으로 인한 수정

1번문제
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class HideButton extends JFrame{
	private MyPanel panel = new MyPanel();
	private JButton btn = new JButton("Hide/Show");
	
	private ImageIcon image = new ImageIcon("/Users/user/Desktop/practice/back.jpg");	// 경로는 다르게 설정해야 함
	private Image img = image.getImage();
	
	int cnt = 0;		// 버튼이 몇 번 눌러졌는지 체크하기 위함
	
	public HideButton(){
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		add(btn);							// "Hide/Show" 버튼을 컨텐츠팬에 추가
		
		// btn이 눌러질때마다 그림의 hide / show 설정 (익명 클래스 사용)
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cnt++;
				if(cnt % 2 == 1) {		// 이미 이미지가 출력되어 있었다면 이미지를 없앰
					img = null;
					repaint();
				}
				else {					// 이미지가 없었다면 이미지를 설정
					img = image.getImage();
					repaint();
				}
			}
		});
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}
	
	// paintComponent를 이용하여 이미지 그림
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);		// 화면에 꽉 차게 설정
		}
	}
	
	public static void main(String[] args) {
		new HideButton();
	}

 2번문제
 import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class CircleDraggedEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public CircleDraggedEx(){
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}
	
	// paintComponent를 이용하여 이미지 그림
	class MyPanel extends JPanel{
		private ImageIcon image = new ImageIcon("/Users/user/Desktop/practice/back.jpg");	// 경로는 다르게 설정해야 함
		private Image img = image.getImage();
		int x = 100, y = 100;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);		// 화면에 꽉 차게 설정
			g.setColor(Color.green);
			g.fillOval(x, y, 20, 20);								// 초기 위치는 (100, 100)으로 설정
			
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					// x와 y의 좌표를 드래그 된 위치로 바꾸고 repaint()
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
	}
	
	public static void main(String[] args) {
		new CircleDraggedEx();
	}
}

3번문제
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class apple extends JFrame{
	JLabel label = new JLabel();
	ImageIcon icon = new ImageIcon("/Users/user/Desktop/practice/apple.jpg");
	public apple() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		label.setIcon(icon);
		label.setSize(icon.getIconWidth(), icon.getIconHeight());
		c.add(label);
		
		c.addMouseMotionListener(new MouseAdapter(){
			public void mouseDragged(MouseEvent e) {
				Component c = (Component)e.getSource();
				c.setLocation(e.getX(), e.getY());
			}
		});
		
		setVisible(true);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new apple();
	}
}

4번문제
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class apple extends JFrame{
	private MyPanel panel = new MyPanel(); 
	public apple() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);		// panel을 CONTENTPANE으로 설정
		setVisible(true);
		setSize(500, 500);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon image = new ImageIcon("/Users/user/Desktop/practice/apple.jpg");
		private Image img = image.getImage();
		int x = 0 , y = 0;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, x, y, getWidth()/4, getHeight()/4, this);	// 이미지의 크기에 따라서 가변적으로 설정
			addMouseMotionListener(new MouseMotionAdapter() {	// 마우스 어댑터를 익명 클래스를 활용하여 구현
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();					// 현재 마우스의 좌표를 받아온 후 repaint()
				}
			});
		}
	}
	public static void main(String[] args) {
		new apple();
	}
}
