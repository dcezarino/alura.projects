package br.com.caelum.banco;

public class Conta {
	int numero;
	Pessoa titular;

	// Atributos
	double saldo;
	int agencia;
	
	
	// this.saldo = 800 + 100 (Valor do Mauricio)
	// Alteramos somente neste lugar e sera propagado para todos os clientes
	void deposita(double valorASerDepositado) {
		this.saldo += valorASerDepositado;
	}

	// Metodos
	void saca(double valorASerSacado) {
		if (this.saldo >= valorASerSacado) {
			this.saldo -= valorASerSacado;
		}

	}
	
	void transfere(double valor, Conta destino){
		this.saldo -= valor;
		destino.saldo += valor;
		
	}

}
