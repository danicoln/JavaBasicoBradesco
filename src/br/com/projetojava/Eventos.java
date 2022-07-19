package br.com.projetojava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {
	
	public Eventos() {
		super ("Meus eventos");
		
		JButton botao = new JButton("Clique");
		botao.addActionListener(this);
		
		getContentPane().add(botao);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Eventos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Voc� clicou!");
	}
}
