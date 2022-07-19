package br.com.projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Meuframe extends JFrame{
	
	public Meuframe() {
		
		super ("Meu Frame");
		
		JButton botao = new JButton("Clique");
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		setVisible(true);
	}	
	
	public static void main(String[] args) {
		new Meuframe();
	}
}
