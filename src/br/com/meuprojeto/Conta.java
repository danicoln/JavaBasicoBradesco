package br.com.meuprojeto;

public class Conta {
	
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	
	void saque (double valor) {
		saldo -= valor;
	}
	
	void deposita (double valor) {
		saldo += valor;
	}
	
	void tranferenciaValor(Conta destino, double valor) {
		this.saque(valor);
		destino.deposita(valor);
	}

}
