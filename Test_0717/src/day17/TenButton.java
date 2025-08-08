package day17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TenButton extends JFrame {
	Random ran = new Random();

	public TenButton() {
		setTitle("Quiz1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton(i + "번 버튼");
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					btn.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
					
				}
			});

			c.add(btn);
		}
		setSize(500, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TenButton();
	}

}
