package br.com.caelum.turma;

public class Turma {
	// Dentro da classe turma tem um array de notas, mas é null por padrão, por
	// isso temos que criar.
	Aluno[] alunos;
	
	void imprimeNotas(){
		
		for (int i = 0; i < this.alunos.length; i++) {
			Aluno aluno = this.alunos[i];
			if (aluno == null) continue;
			System.out.println(aluno.nota);
			
		}
		
	}

}
