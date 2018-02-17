package br.com.caelum.empresa;

public class Gerente extends Funcionario {

	public double getBonus() {
		return this.salario * 0.3;
	}

	public void cobraEntrega() {
		System.out.println("Esta pronto!");
	}

}
