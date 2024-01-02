package main.java.skiresorts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Kotelnica {
	private JFrame frame = new JFrame("Kotelnica Białczańska");
	private JPanel titlePanel  = new JPanel();
	private JPanel listPanel  = new JPanel();
	private JLabel nameField = new JLabel();
	
	Kotelnica(){
		initFrame();
		
		frame.setVisible(true);
	}
	
	void initFrame() {
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(255,255,204));
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
	}
}
