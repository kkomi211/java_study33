package day17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame {
	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		Random ran = new Random();
		Button btn = new Button("hi");
		btn.setSize(125,1200);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getClickCount() == 2) {
					Component com = (Component) e.getSource();
					com.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
				}

			}

		});
		c.add(btn);
		c.setLayout(new FlowLayout());
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getClickCount() == 2) {
					Component com = (Component) e.getSource();
					com.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
				}

			}

		});
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickAndDoubleClickEx();

	}

}
