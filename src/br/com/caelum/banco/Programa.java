package br.com.caelum.banco;

public class Programa {
	
	public static void main(String[] args) {
		// new Conta() nos devolve uma conta 
		// A variavel mauricio aponta para uma conta na memoria
		
//		Quando fazemos new Conta o java cria uma espaco na memoria para guardar justamente a Conta, essa 
//		regiao de memoria e conhecida por HEAP, em seguida guardamos isso na referencia Mauricio, e uma seta
//		que aponta para a Conta.
//		
//		Referencias sao setas que apontam para os objetos na memoria
//		
		
		// Mauricio é uma referencia para a uma conta
		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.saldo = 800.00;
		mauricio.agencia = 842;
		
		mauricio.titular = new Pessoa();
		mauricio.titular.nome = "Mauricio Aniche";
		mauricio.titular.cpf = "123456789";
		mauricio.titular.dataNascimento = "27/06/1989";
		
		System.out.println(mauricio.titular.nome);
				
		// Valor a ser depositado
		mauricio.deposita (100.0);
		mauricio.saca(5000.0);

		
		Conta guilherme = new Conta();
		guilherme.numero = 456;
		guilherme.saldo = 1200.00;
		
		guilherme.deposita(100.0);
				
		mauricio.transfere(100.0, guilherme);
				
		System.out.println("Mauricio R$ " + mauricio.saldo);
		System.out.println("Guilherme R$ " + guilherme.saldo);
		
	}

}
