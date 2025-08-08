package day17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame{
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.add(la);
		c.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				char keychar = e.getKeyChar();
				int keycode = e.getKeyCode();
				
				System.out.println("유니코드 값 ==> " + keychar);
				System.out.println("가상키 값 ==> " + keycode);
				System.out.println("특수키 포함 값 ==>" + e.getKeyText(keycode));
				if(keychar == '%') {
					c.setBackground(Color.yellow);
				} else if (keycode == KeyEvent.VK_F1) {
					c.setBackground(Color.green);
				} else if (keycode == KeyEvent.VK_DELETE) {
					c.setBackground(Color.blue);
				}
				
				la.setText(e.getKeyText(keycode));
				
			}
		});
		
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}

}
