2주차에는 아래와같이 책의 예제를 풀어보며 이번 프로젝트를 어떻게 구상해 나갈것인가, 예제에 나오는 기능을 어디에 사용하면 좋을까등 학습겸 구상을 하고있습니다.

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();

	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키 : 초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300, 150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container) e.getSource();

			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입력되었음");

			if (e.getKeyChar() == '%')
				contentPane.setBackground(Color.YELLOW);
			else if (e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
			else if (e.getKeyCode() == KeyEvent.VK_CONTROL)
				contentPane.setBackground(Color.BLUE);
		}
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}

}


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListener extends JFrame {
	private JLabel[] keyMessage;

	public KeyListener() {
		setTitle("keyListenter 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());

		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel("getKeyCode() ");
		keyMessage[1] = new JLabel("getKeyChar() ");
		keyMessage[2] = new JLabel("getKeyText() ");

		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300, 150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));

			System.out.println("KeyPressed");
		}

		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");
		}

		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
		}
	}

	public static void main(String[] args) {
		new KeyListener();
	}
}


import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");

	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new MouseAdapterEx();
	}
}


import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");

	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());

		c.setLayout(null);
		la.setSize(50, 20);
		;
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}

	public static void main(String[] args) {
		new MouseListenerEx();
	}
}


-------------------------

# javaprogram
주제 : 
기능 
1. 회원가입
2. 로그인
3. 제품판매 및 설명
