package _241129_gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame {
	public Main6() {
		super("Border 레이아웃 연습");
		
//		add(new JButton("north"), "North");
		add(new JButton("north"), BorderLayout.NORTH); // 문자열대신 상수를 사용할 수 있다
		add(new JButton("south"), "South");
		add(new JButton("west"), "West");
		add(new JButton("east"), "East");
//		add(new JButton("center"), "Center");
//		add(new JButton("center"); // Center 위치는 생략할 수 있다
		
		// JPanel의 기본값은 Flow 레이아웃이다
		JPanel pnlCenter = new JPanel();
		add(pnlCenter, "Center");
		
		pnlCenter.setLayout(new GridLayout(3, 0)); // 그리드가 행의 갯수를 맞추도록 버튼을 배치하게 된다
//		pnlCenter.setLayout(new GridLayout(0, 3)); // 그리드가 열의 갯수를 맞추도록 버튼을 배치하게 된다
		
		pnlCenter.add(new JButton("버튼"));
		pnlCenter.add(new JButton("버튼"));
		pnlCenter.add(new JButton("버튼"));
		
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		Main6 main6 = new Main6();
	}
}
