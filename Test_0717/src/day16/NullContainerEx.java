package day16;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		Random ran = new Random();
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성
			b.setLocation(i * 15, i * 15);
			b.setSize(50, 20);
			b.setBackground(new Color(i * 5, i * 20, i * 25));
			c.add(b); // 버튼을 컨텐트팬에 부착
		}
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}
}
