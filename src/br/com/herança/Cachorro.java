package br.com.herança;

public class Cachorro extends Animal {

	private int tamanho;
	private String raça;

	public Cachorro() {
	}
	
	public Cachorro(int tamanho, String raça) {
		this.tamanho = tamanho;
		this.raça = raça;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getRaça() {
		return raça;
	}

	public void latir() {
		System.out.println("Au, au, au, au!!!!! ");
	}
}
