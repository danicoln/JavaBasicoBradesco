package br.com.projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {

	public Layouts() {
		super("Meu Layout");
		
		getContentPane().add(new JButton("Botão Centralizado"));
		getContentPane().add(new JButton("Botão Centralizado 2"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 350);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new Layouts();
	}
}
