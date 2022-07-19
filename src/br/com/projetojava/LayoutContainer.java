package br.com.projetojava;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutContainer extends JFrame {

	public LayoutContainer() {

		super ("Meu Layout");
		
		Container c = getContentPane();
		
		c.add(BorderLayout.NORTH, new JButton("Botão Norte"));
		c.add(BorderLayout.SOUTH, new JButton("Botão Sul"));
		c.add(BorderLayout.CENTER, new JButton("Botão Centro"));
		c.add(BorderLayout.EAST, new JButton("Botão Leste"));
		c.add(BorderLayout.WEST, new JButton("Botão Oeste"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 350);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new LayoutContainer();
	}
	
}
