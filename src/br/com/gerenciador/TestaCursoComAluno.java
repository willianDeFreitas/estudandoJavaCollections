package br.com.gerenciador;

import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) throws Exception {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini","12345");
		Aluno a2 = new Aluno("Guilherme Silveira", "5617");
		Aluno a3 = new Aluno("Willian de Freitas", "17645");
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Vector<Aluno> vetor = new Vector<>();
		
//		Set<Aluno> alunos = javaColecoes.getAlunos();
//		Iterator<Aluno> iterator = alunos.iterator();
//		while(iterator.hasNext()) {
//			Aluno proximo = iterator.next();
//			System.out.println(proximo);
//		}
		
//		for (Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
//		System.out.println("Todos matriculados: ");
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});
		
		System.out.println(javaColecoes.estaMatriculado(a1));
	}
}
