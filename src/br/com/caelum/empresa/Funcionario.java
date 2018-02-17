package br.com.caelum.empresa;

public class Funcionario {
	
	// As classes que erdam de funcionario podem acessar o meu salario.
	protected double salario;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return this.salario * 0.2;

	}

}
