package br.com.caelum.empresa;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario joao = new Funcionario();
		
		joao.setSalario(1000.0);
		System.out.println(joao.getBonus());
		
		
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		joaquim.cobraEntrega();
		
		System.out.println(joaquim.getBonus());
		
		TotalizadorDeBonus totalizadordebonus = new TotalizadorDeBonus();
		totalizadordebonus.adiciona(joao);
		totalizadordebonus.adiciona(joaquim);
				
		System.out.println(totalizadordebonus.getTotal());
		
		
		
	}

}
