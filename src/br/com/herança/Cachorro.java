package br.com.heran�a;

public class Cachorro extends Animal {

	private int tamanho;
	private String ra�a;

	public Cachorro() {
	}
	
	public Cachorro(int tamanho, String ra�a) {
		this.tamanho = tamanho;
		this.ra�a = ra�a;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void latir() {
		System.out.println("Au, au, au, au!!!!! ");
	}
}
