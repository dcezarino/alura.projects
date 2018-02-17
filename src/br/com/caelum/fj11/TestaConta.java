package br.com.caelum.fj11;

public class TestaConta {
	public static void main(String[] args) {
		
		// CTRL + 1 - Criar varial local
		Conta conta = new Conta();
		conta.setNome("Mauricio");
		
		// CTRL + 1 - Criar metodo
		conta.imprime();
		
		System.out.println(conta.getNome());
	}

}
