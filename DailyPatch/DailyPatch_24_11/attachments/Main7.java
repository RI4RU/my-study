package _241129_gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main7 extends JFrame {
	public Main7() {
		super("absolute 레이아웃");
		
		JPanel pnlWest = new JPanel();
		pnlWest.setBackground(Color.WHITE);
		pnlWest.add(new JButton("필요한 크기와 위치가 조절됨"));
		pnlWest.add(new JButton("필요한 크기와 위치가 조절됨"));
		pnlWest.add(new JButton("필요한 크기와 위치가 조절됨"));
		JButton sized = new JButton("임의 크기 설정");
		sized.setPreferredSize(new Dimension(75, 75)); // 절대 레이아웃이 아닌경우 setSize를 사용할 수 없다
		pnlWest.add(sized);
		
		JPanel pnlEast = new JPanel();
		// absolute 레이아웃 (절대 레이아웃) : 개발자가 모든 요소의 위치와 크기를 결정해야한다
		pnlEast.setLayout(null);
		JButton myBtn = new JButton("버튼");
		myBtn.setSize(100, 100);
		myBtn.setLocation(55, 155);
		pnlEast.add(myBtn);
		
		Dimension dimension = myBtn.getSize();
		int x = myBtn.getX() + dimension.width + 20;
		int y = myBtn.getY();
		
		JButton yourBtn = new JButton("추가 버튼");
		yourBtn.setSize(dimension);
		yourBtn.setLocation(x, y);
		pnlEast.add(yourBtn);
		
		add(pnlWest, "West");
		add(pnlEast, "Center");
		
		setSize(1000, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		Main7 main7 = new Main7();
	}

}
