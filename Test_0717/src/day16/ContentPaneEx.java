package day16;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setBackground(new Color(235,25,235));
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
		contentPane.add(new JButton("집가고 싶다"));
		contentPane.add(new JButton("i want to go home"));
		contentPane.add(new JButton("졸리다"));
		contentPane.add(new JColorChooser());
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
