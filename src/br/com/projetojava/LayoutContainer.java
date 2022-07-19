package br.com.projetojava;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutContainer extends JFrame {

	public LayoutContainer() {

		super ("Meu Layout");
		
		Container c = getContentPane();
		
		c.add(BorderLayout.NORTH, new JButton("Bot�o Norte"));
		c.add(BorderLayout.SOUTH, new JButton("Bot�o Sul"));
		c.add(BorderLayout.CENTER, new JButton("Bot�o Centro"));
		c.add(BorderLayout.EAST, new JButton("Bot�o Leste"));
		c.add(BorderLayout.WEST, new JButton("Bot�o Oeste"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 350);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new LayoutContainer();
	}
	
}
