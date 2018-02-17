package br.com.caelum.programa;

public class Programa {

	public static void main(String[] args) {

		// Idade da pessoa
		int idade = 79;

		boolean maiorDeIdade = idade >= 60;
		boolean amigoDoDono = true;

		if (maiorDeIdade) {
			System.out.println("Aproveite a melhor idade!");
		} else if (maiorDeIdade && amigoDoDono) {
			System.out.println("Entra na Festa!");
		} else {
			System.out.println("Volta pra Casa!");
		}

		/*
		 * int numeroPequeno = 32000; long numeroGrande = 9999999999L;
		 * 
		 * float outroPi = (float) 3.14; double pi = 3.14;
		 * 
		 * int numero = 10; long copiaDeNumero = numero;
		 * 
		 * long numeroDois = 314; int copiaDeNumeroDois = (int)numeroDois;
		 * 
		 * // Conversao Cast double grande = 10.8; float copia = (float) grande;
		 * System.out.println(copia);
		 */

		/*
		 * int idadeJoao = 18; int idadeMaria = 21;
		 * 
		 * int somaDasIdade = idadeJoao + idadeMaria;
		 * 
		 * System.out.println(somaDasIdade);
		 * 
		 * // No java todas as variaveis antes de ser usadas devem ser
		 * inicializadas int numero = 10; System.out.println(numero);
		 * 
		 * double pi = 3.1415; double dobroDoPi = pi * 2;
		 * System.out.println(dobroDoPi);
		 * 
		 * boolean amigo = true; boolean inimigo = !amigo;
		 * 
		 * System.out.println(inimigo);
		 * 
		 * boolean maiorDeIdade = idadeJoao >= 18; boolean maiorDeIdade =
		 * idadeJoao == 18; boolean maiorDeIdade = idadeJoao <= 18;
		 * 
		 * char letra = 'M'; String nomeCompleto = "Joao da Silva";
		 */

	}

}
