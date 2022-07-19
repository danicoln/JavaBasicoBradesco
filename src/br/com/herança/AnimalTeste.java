package br.com.herança;

public class AnimalTeste {

	public static void main(String[] args) {

		Cachorro lulu = new Cachorro();
		lulu.comida = "Ração";
		lulu.dormir();
		
		Galinha cocorica = new Galinha();
		cocorica.dormir();
	}

}
