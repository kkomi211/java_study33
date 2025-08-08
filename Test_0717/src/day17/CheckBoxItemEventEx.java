package day17;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = { "사과", "배", "체리" };
	private JLabel sumLabel;
	private int sum = 0;

	public CheckBoxItemEventEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			c.add(fruits[i]);
			fruits[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					System.out.println(e.getStateChange());
					if (e.getStateChange() == ItemEvent.SELECTED) {
						if (e.getItem() == fruits[0]) {
							sum += 100;
						} else if (e.getItem() == fruits[1]) {
							sum += 500;
						} else {
							sum += 20000;
						}
					} else {
						if (e.getItem() == fruits[0]) {
							sum -= 100;
						} else if (e.getItem() == fruits[1]) {
							sum -= 500;
						} else {
							sum -= 20000;
						}
					}
					
					sumLabel.setText("현재 " + sum + "원 입니다.");
				}
			});
		}

		sumLabel = new JLabel("현재 0 원 입니다.");
		c.add(sumLabel);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
