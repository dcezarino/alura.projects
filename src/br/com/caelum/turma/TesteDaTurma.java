package br.com.caelum.turma;

public class TesteDaTurma {

	public static void main(String[] args) {
		Turma fj11 = new Turma();

		// Array é um objeto.
		fj11.alunos = new Aluno[10];
		
		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Mauricio";
		fj11.alunos[0].nota = 9;

		fj11.alunos[1] = new Aluno();		
		fj11.alunos[1].nome = "Marcelo";
		fj11.alunos[1].nota = 5;
		
		fj11.alunos[2] = new Aluno();
		fj11.alunos[2].nome = "Diego";
		fj11.alunos[2].nota = 10;
		
		fj11.imprimeNotas();

	}

}
