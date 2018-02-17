package br.com.caelum.fj11;

public class Conta {

	// CTRL + N - Nova Classe
	private double saldo;
	private String nome;
	private int agencia;

	
	
	// CRTL + 3 - GGAS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void imprime() {
		System.out.println("nome");
		System.out.println("agencia");
		
	}

}
